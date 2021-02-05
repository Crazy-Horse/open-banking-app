package com.sygmatech.example.betterbanking.web;

import com.sygmatech.example.betterbanking.service.TransactionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import javax.annotation.PostConstruct;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.when;
import static org.hamcrest.Matchers.is;

@SpringBootTest
public class TransactionComponentTest {

    private String uri;
    private TransactionService service;

    @BeforeEach
    void initialize() {
        service = new TransactionService(uri);
    }

    @PostConstruct
    public void init() {
        uri = "http://localhost:8080";
    }

    @Test
    public void whenRequestGet_thenOK(){
        when().request("GET", "/transactions/123456").then().statusCode(200);
    }

    @Test
    public void whenJsonResponseHasAllValuesAssociatedWithAccount_thenCorrect() {
        given().standaloneSetup(new TransactionController(service))
                .when()
                .get("/transactions/123456").then()
                .statusCode(HttpStatus.OK.value())
                .assertThat()
                .body("size()", is(3));
    }
}
