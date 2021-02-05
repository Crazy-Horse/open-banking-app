package com.sygmatech.example.betterbanking.web;

import com.sygmatech.example.betterbanking.domain.OBTransaction6;
import com.sygmatech.example.betterbanking.domain.Transaction;
import com.sygmatech.example.betterbanking.util.OBTransactionAdapter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class RESTTransactionsAPIClient implements TransactionApiClient {

    @Override
    public List<Transaction> getTransactions(String accountNumber) {

        List<Transaction> transactions = new LinkedList<>();
        WebClient client = WebClient
                .builder()
                .baseUrl("http://localhost:8080")
                .defaultCookie("cookieKey", "cookieValue")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultUriVariables(Collections.singletonMap("url", "http://localhost:8080"))
                .build();

        Flux<OBTransaction6> transaction6Flux = client.get()
                .uri("/accounts/{accountId}/transactions", accountNumber)
                .retrieve()
                /*.onStatus(httpStatus -> HttpStatus.NOT_FOUND.equals(httpStatus),
                        clientResponse -> Mono.empty())*/
                .bodyToFlux(OBTransaction6.class);

        transaction6Flux
                .timeout(Duration.ofSeconds(2))
                .subscribe(
                        t -> {
                            Optional<Transaction> optionalTransaction = OBTransactionAdapter.transform(t);
                            if (optionalTransaction.isPresent()) {
                                transactions.add(optionalTransaction.get());
                            }
                        },
                        e -> {
                            // handle timeout exception
                        }
                );
        return transactions;
    }
}
