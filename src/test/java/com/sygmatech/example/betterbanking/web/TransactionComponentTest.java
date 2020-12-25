package com.sygmatech.example.betterbanking.web;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import javax.annotation.PostConstruct;

@SpringBootTest
public class TransactionComponentTest {

    private String uri;

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
        get("/transactions/123456").then()
                .statusCode(HttpStatus.OK.value())
                .assertThat()
                .body("size()", is(3));
    }
}
