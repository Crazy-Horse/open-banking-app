package com.sygmatech.example.betterbanking.service;

import com.sygmatech.example.betterbanking.dao.BankingTransactionRepository;
import com.sygmatech.example.betterbanking.dao.MerchantDetailsRepository;
import com.sygmatech.example.betterbanking.dao.TransactionApiClient;
import com.sygmatech.example.betterbanking.domain.Transaction;
import com.sygmatech.example.betterbanking.util.OBTransactionAdapter;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TransactionService {

    private final TransactionApiClient transactionApiClient;
    private final MerchantDetailsRepository merchantDetailsRepository;
    private final BankingTransactionRepository bankingTransactionRepository;

    private final OBTransactionAdapter adapter = new OBTransactionAdapter();

    private static final Logger log = LoggerFactory.getLogger(TransactionService.class);

    public TransactionService(
            final TransactionApiClient transactionApiClient, final MerchantDetailsRepository merchantDetailsRepository, BankingTransactionRepository bankingTransactionRepository) {
        this.transactionApiClient = transactionApiClient;
        this.merchantDetailsRepository = merchantDetailsRepository;
        this.bankingTransactionRepository = bankingTransactionRepository;
    }

    @CircuitBreaker(name="transactionservice", fallbackMethod = "buildFallbackTransactionList")
    @Cacheable("transactions")
    public List<Transaction> findAllByAccountNumber(final Integer acctNum) {
        log.info("calling remote service to retrieve transactions");
        var transactions= transactionApiClient.getTransactions(acctNum);
        transactions.forEach(transaction -> {
            merchantDetailsRepository.findMerchantLogo(transaction.getMerchantName()).ifPresent(logo -> {
                transaction.setMerchantLogo(logo);
            });
            bankingTransactionRepository.save(adapter.adapt(transaction));
        });
//        List<Transaction> transactions = new LinkedList<>();
//        transactions.add(new Transaction("deposit", "00023456", "USD", 30.25, "Costco", "logo" ));
//        transactions.add(new Transaction("withdrawal", "00023456", "USD", 100.25, "Costco", "logo" ));
//        transactions.add(new Transaction("deposit", "00023456", "USD", 200.25, "Costco", "logo" ));
        return transactions;
    }

    private List<Transaction> buildFallbackTransactionList(final Integer accountNumber, final Throwable throwable) {
        return Collections.emptyList();
    }
}
