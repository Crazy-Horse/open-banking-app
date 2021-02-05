package com.sygmatech.example.betterbanking.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sygmatech.example.betterbanking.domain.Transaction;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.io.IOException;
import java.util.List;

public class TransactionServiceTest {

    private TransactionService service;
    private ObjectMapper MAPPER = new ObjectMapper();

    public static MockWebServer mockBackEnd;

    @BeforeAll
    static void setUp() throws IOException {
        mockBackEnd = new MockWebServer();
        mockBackEnd.start();
    }

    @AfterAll
    static void tearDown() throws IOException {
        mockBackEnd.shutdown();
    }

    @BeforeEach
    void initialize() {
        String baseUrl = String.format("http://localhost:%s",
                mockBackEnd.getPort());
        service = new TransactionService(baseUrl);
    }

    @Test
    void findAllByAccountNumber() throws JsonProcessingException {
        Transaction mockTransaction = new Transaction("deposit", "00023456", "USD", 30.25, "Acme", "acme-logo.png" );
        mockBackEnd.enqueue(new MockResponse()
                .setBody(MAPPER.writeValueAsString(mockTransaction))
                .addHeader("Content-Type", "application/json"));

        List<Transaction> transactions = service.findAllByAccountNumber("00023456");
        Flux<Transaction> transactionFlux = Flux.fromIterable(transactions);

        StepVerifier.create(transactionFlux)
                .expectNextMatches(trans -> trans.getAmount() == 30.25)
                .verifyComplete();
    }

}
