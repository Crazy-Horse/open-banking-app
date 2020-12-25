package com.sygmatech.example.betterbanking.service;

import com.sygmatech.example.betterbanking.domain.Transaction;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> findAllByAccountNumber(String acctNum) {
        List<Transaction> transactions = new LinkedList<>();
        transactions.add(new Transaction(1111L, "deposit", "00023456", "USD", 30.25, "Costco", "logo" ));
        transactions.add(new Transaction(1112L, "withdrawal", "00023456", "USD", 100.25, "Costco", "logo" ));
        transactions.add(new Transaction(1113L, "deposit", "00023456", "USD", 200.25, "Costco", "logo" ));
        return transactions;
    }
}
