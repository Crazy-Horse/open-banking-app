package com.sygmatech.example.betterbanking.dao;

import com.acme.banking.model.OBReadTransaction6;
import com.fasterxml.jackson.databind.JsonNode;
import com.sygmatech.example.betterbanking.domain.Transaction;
import com.sygmatech.example.betterbanking.util.OBTransactionAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Slf4j
@PropertySource(ignoreResourceNotFound = true, value = "classpath:application.properties")
@Service
public class RESTTransactionsAPIClient implements TransactionApiClient {

    private final WebClient client;
    private final OBTransactionAdapter adapter = new OBTransactionAdapter();

    @Value("${testnet.integration.client:better-banking}")
    private String clientId;
    @Value("${testnet.integration.secret}")
    private String secret;

    @Autowired
    public RESTTransactionsAPIClient(final WebClient client) {
        this.client = client;
    }

    @Override
    public List<Transaction> getTransactions(final Integer accountNumber) {

        OBReadTransaction6 res = null;

        String encodedClientData =
                Base64Utils.encodeToString(String.format("%s:%s", clientId, secret).getBytes());
        try {
            res = client
                    .post()
                    .uri("/oauth/token")
                    .header("Authorization", "Basic " + encodedClientData)
                    .body(BodyInserters.fromFormData("grant_type", "client_credentials"))
                    .retrieve()
                    .bodyToMono(JsonNode.class)
                    .flatMap(tokenResponse -> {
                        String accessTokenValue = tokenResponse.get("access_token")
                                .textValue();
                        return client.get()
                                .uri("accounts/" + accountNumber + "/transactions")
                                .headers(h -> h.setBearerAuth(accessTokenValue))
                                .retrieve()
                                .bodyToMono(OBReadTransaction6.class);
                    })
                    .block();
        } catch (Exception ex) {
            log.error("failed to retrieve account information due to the following reason {}", ex.getMessage());
        }

        if (res == null || res.getData() == null) {
            return Collections.emptyList();
        }

        return res.getData()
                .getTransaction()
                .stream()
                .map(adapter::adapt)
                .collect(toList());
    }
}
