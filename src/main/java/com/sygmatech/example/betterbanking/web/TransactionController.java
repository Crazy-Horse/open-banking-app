package com.sygmatech.example.betterbanking.web;

import com.sygmatech.example.betterbanking.domain.Transaction;
import com.sygmatech.example.betterbanking.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService service;

    TransactionController(TransactionService transactionService) {
        this.service = transactionService;
    }

    @GetMapping("/{accountNumber}")
    @PostFilter(value = "hasAuthority(filterObject.accountNumber)")
    public List<Transaction> findAllByAccountNumber(@PathVariable("accountNumber") final Integer accountNumber, Principal principal) {
        return service.findAllByAccountNumber(accountNumber);
    }

    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
        return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
