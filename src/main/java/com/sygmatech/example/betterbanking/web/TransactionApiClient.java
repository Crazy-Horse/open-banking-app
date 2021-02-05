package com.sygmatech.example.betterbanking.web;

import com.sygmatech.example.betterbanking.domain.Transaction;

import java.util.List;

public interface TransactionApiClient {

    List<Transaction> getTransactions(String accountNumber);
}
