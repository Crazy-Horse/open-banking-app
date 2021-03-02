package com.sygmatech.example.betterbanking.service;

import com.sygmatech.example.betterbanking.dao.MerchantDetailsRepository;
import com.sygmatech.example.betterbanking.dao.TransactionApiClient;
import com.sygmatech.example.betterbanking.domain.Transaction;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TransactionService {

    private final TransactionApiClient transactionApiClient;
    private final MerchantDetailsRepository merchantDetailsRepository;

    public TransactionService(
            final TransactionApiClient transactionApiClient,
            final MerchantDetailsRepository merchantDetailsRepository) {
        this.transactionApiClient = transactionApiClient;
        this.merchantDetailsRepository = merchantDetailsRepository;
    }

    //@CircuitBreaker(name="transactionservice", fallbackMethod = "buildFallbackTransactionList")
    public List<Transaction> findAllByAccountNumber(String acctNum) {
        var transactions= transactionApiClient.getTransactions(acctNum);
        transactions.forEach(transaction -> {
            merchantDetailsRepository.findMerchantLogo(transaction.getMerchantName()).ifPresent(logo -> {
                transaction.setMerchantLogo(logo);
            });
        });
//        List<Transaction> transactions = new LinkedList<>();
//        transactions.add(new Transaction("deposit", "00023456", "USD", 30.25, "Costco", "logo" ));
//        transactions.add(new Transaction("withdrawal", "00023456", "USD", 100.25, "Costco", "logo" ));
//        transactions.add(new Transaction("deposit", "00023456", "USD", 200.25, "Costco", "logo" ));
        return transactions;
    }

    private List<Transaction> buildFallbackTransactionList(String acctNum) {
        return Collections.emptyList();
    }
}
