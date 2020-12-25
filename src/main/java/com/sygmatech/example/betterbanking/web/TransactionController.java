package com.sygmatech.example.betterbanking.web;

import com.sygmatech.example.betterbanking.domain.Transaction;
import com.sygmatech.example.betterbanking.service.TransactionService;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
public class TransactionController {

    private final TransactionService service;

    TransactionController(TransactionService transactionService) {
        this.service = transactionService;
    }

    @GetMapping("/transactions/{accountNumber}")
    public @ResponseBody List<Transaction> allByAccountNumber(@PathVariable String accountNumber) {
        return service.findAllByAccountNumber(accountNumber);
    }
}
