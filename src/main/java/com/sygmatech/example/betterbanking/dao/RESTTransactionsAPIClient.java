package com.sygmatech.example.betterbanking.dao;

import com.sygmatech.example.betterbanking.domain.OBReadTransaction6;
import com.sygmatech.example.betterbanking.domain.Transaction;
import com.sygmatech.example.betterbanking.util.OBTransactionAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Slf4j
@Service
public class RESTTransactionsAPIClient implements TransactionApiClient {

    private final WebClient client;
    private final OBTransactionAdapter adapter = new OBTransactionAdapter();

    @Autowired
    public RESTTransactionsAPIClient(final WebClient client) {
        this.client = client;
    }

    @Override
    public List<Transaction> getTransactions(String accountNumber) {

        OBReadTransaction6 res = null;

        try {
            res = client.get()
                    .uri("accounts/" + accountNumber + "/transactions")
                    .retrieve()
                    .bodyToMono(OBReadTransaction6.class)
                    .block()
            ;
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
