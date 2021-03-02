package com.sygmatech.example.betterbanking.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sygmatech.example.betterbanking.dao.MerchantDetailsRepository;
import com.sygmatech.example.betterbanking.dao.TransactionApiClient;
import com.sygmatech.example.betterbanking.domain.Transaction;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class TransactionServiceTest {

    @Mock
    private TransactionApiClient transactionApiClient;
    @Mock private MerchantDetailsRepository merchantDetailsRepository;
    @InjectMocks
    private TransactionService transactionService;
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
    void setup() {
        when(transactionApiClient.getTransactions(any())).thenReturn(List.of(new Transaction("deposit", "00023456", "USD", 30.25, "Acme")));
    }

    @DisplayName("test TransactionService with mock TransactionApiClient")
    @Test
    public void testTransactionCount() {
        assertEquals(1, transactionService.findAllByAccountNumber("1234567").size());
    }

    @Test
    void findAllByAccountNumber() throws JsonProcessingException {
        Transaction mockTransaction = new Transaction("deposit", "00023456", "USD", 30.25, "Acme");
        mockBackEnd.enqueue(new MockResponse()
                .setBody(MAPPER.writeValueAsString(mockTransaction))
                .addHeader("Content-Type", "application/json"));

        List<Transaction> transactions = transactionService.findAllByAccountNumber("00023456");
        Flux<Transaction> transactionFlux = Flux.fromIterable(transactions);

        StepVerifier.create(transactionFlux)
                .expectNextMatches(trans -> trans.getAmount() == 30.25)
                .verifyComplete();
    }

}
