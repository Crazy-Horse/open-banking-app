package com.sygmatech.example.betterbanking.service;

import com.sygmatech.example.betterbanking.domain.Transaction;
import com.sygmatech.example.betterbanking.web.RESTTransactionsAPIClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class TransactionService {


    private RESTTransactionsAPIClient client;
    private WebClient webClient;

    private Map<String, String> map = Map.of("acme","acme-logo.png", "globex", "globex-logo.png",
            "morley", "morley-logo.png", "contoso", "contoso-logo.png");

    @Autowired
    public TransactionService(RESTTransactionsAPIClient client) {
        this.client = client;
    }

    public TransactionService(String baseUrl) {
        this.webClient = WebClient.create(baseUrl);
    }

    @CircuitBreaker(name="transactionservice", fallbackMethod = "buildFallbackTransactionList")
    public List<Transaction> findAllByAccountNumber(String acctNum) {
        return client.getTransactions(acctNum);
//        List<Transaction> transactions = new LinkedList<>();
//        transactions.add(new Transaction("deposit", "00023456", "USD", 30.25, "Costco", "logo" ));
//        transactions.add(new Transaction("withdrawal", "00023456", "USD", 100.25, "Costco", "logo" ));
//        transactions.add(new Transaction("deposit", "00023456", "USD", 200.25, "Costco", "logo" ));
//        return transactions;
    }

    private List<Transaction> buildFallbackTransactionList(String acctNum) {
        return Collections.emptyList();
    }
}
