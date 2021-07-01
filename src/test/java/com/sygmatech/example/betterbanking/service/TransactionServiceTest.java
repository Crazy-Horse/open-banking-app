package com.sygmatech.example.betterbanking.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sygmatech.example.betterbanking.dao.MerchantDetailsRepository;
import com.sygmatech.example.betterbanking.dao.TransactionApiClient;
import com.sygmatech.example.betterbanking.domain.Transaction;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TransactionServiceTest {

    @Mock
    private TransactionApiClient transactionApiClient;
    @Mock private MerchantDetailsRepository merchantDetailsRepository;
    @InjectMocks
    private TransactionService transactionService;
    private ObjectMapper MAPPER = new ObjectMapper();

    public static MockWebServer mockBackEnd;

//    @BeforeAll
//    static void setUp() throws IOException {
//        mockBackEnd = new MockWebServer();
//        mockBackEnd.start();
//    }
//
//    @AfterAll
//    static void tearDown() throws IOException {
//        mockBackEnd.shutdown();
//    }

    @BeforeEach
    void setup() {
        when(transactionApiClient.getTransactions(any())).thenReturn(List.of(new Transaction()));
    }

    @DisplayName("test TransactionService with mock TransactionApiClient")
    @Test
    public void testTransactionCount() {
        assertEquals(1, transactionService.findAllByAccountNumber(1234567).size());
    }

    @Test
    void findAllByAccountNumber() throws JsonProcessingException {
        Transaction mockTransaction = new Transaction();
        mockBackEnd.enqueue(new MockResponse()
                .setBody(MAPPER.writeValueAsString(mockTransaction))
                .addHeader("Content-Type", "application/json"));

        List<Transaction> transactions = transactionService.findAllByAccountNumber(23456);
        Flux<Transaction> transactionFlux = Flux.fromIterable(transactions);

        StepVerifier.create(transactionFlux)
                .expectNextMatches(trans -> trans.getAmount() == 30.25)
                .verifyComplete();
    }

}
