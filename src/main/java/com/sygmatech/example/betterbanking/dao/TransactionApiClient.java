package com.sygmatech.example.betterbanking.dao;

import com.sygmatech.example.betterbanking.domain.Transaction;

import java.util.List;

public interface TransactionApiClient {

    List<Transaction> getTransactions(final Integer accountNumber);
}
