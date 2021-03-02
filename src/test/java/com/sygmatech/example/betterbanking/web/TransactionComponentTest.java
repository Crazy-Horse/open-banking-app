package com.sygmatech.example.betterbanking.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sygmatech.example.betterbanking.dao.InMemoryMerchantDetailsRepository;
import com.sygmatech.example.betterbanking.dao.RESTTransactionsAPIClient;
import com.sygmatech.example.betterbanking.dao.TransactionApiClient;
import com.sygmatech.example.betterbanking.domain.*;
import com.sygmatech.example.betterbanking.service.TransactionService;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;
import java.util.Arrays;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.when;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TransactionComponentTest {

    @LocalServerPort
    private int port;

    private static MockWebServer server;
    TransactionApiClient apiClient = new RESTTransactionsAPIClient(WebClient.create(server.url("/").toString()));
    TransactionService transactionService = new TransactionService(apiClient, new InMemoryMerchantDetailsRepository());

    @BeforeAll
    static void setUp() throws IOException {
        server = new MockWebServer();
        server.start();
    }

    @AfterAll
    static void tearDown() throws IOException {
        server.shutdown();
    }

    @Test
    public void whenRequestGet_thenOK(){
        when().request("GET", "/transactions/123456").then().statusCode(200);
    }

    @Test
    public void whenJsonResponseHasAllValuesAssociatedWithAccount_thenCorrect() {
        given().standaloneSetup(new TransactionController(transactionService))
                .when()
                .get("/transactions/123456").then()
                .statusCode(HttpStatus.OK.value())
                .assertThat()
                .body("size()", is(3));
    }

    @Test
    public void testApplicationEndToEnd() throws Exception {
        var json = new ObjectMapper().writeValueAsString(transaction());
        server.enqueue(new MockResponse()
                .setResponseCode(200)
                .setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .setBody(json));

        var t = Arrays.stream(given().standaloneSetup(new TransactionController(transactionService))
                .when()
                .get(String.format("http://localhost:%s/transactions/1234567", port))
                .then()
                .extract()
                .body()
                .as(Transaction[].class))
                .findAny()
                .orElseThrow();

        assertEquals(100.0d, t.getAmount());
    }

    private OBReadTransaction6 transaction() {
        var t = new OBReadTransaction6();
        t.setData(new OBReadDataTransaction6());
        t.getData().addTransactionItem(transactions());
        return t;
    }

    private OBTransaction6 transactions() {
        var t = new OBTransaction6();
        t.setAccountId("1234567");
        t.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
        t.setAmount(amount());
        t.setMerchantDetails(merchantDetails());
        return t;
    }

    private OBActiveOrHistoricCurrencyAndAmount9 amount() {
        var amount = new OBActiveOrHistoricCurrencyAndAmount9();
        amount.setAmount("100.00");
        amount.setCurrency("USD");
        return amount;
    }

    private OBMerchantDetails1 merchantDetails() {
        var m = new OBMerchantDetails1();
        m.setMerchantName("acme");
        m.setMerchantCategoryCode("25");
        return m;
    }
}
