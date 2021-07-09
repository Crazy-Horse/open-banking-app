package com.sygmatech.example.betterbanking.dao;

import com.sygmatech.example.betterbanking.domain.BankingTransaction;
import org.springframework.data.repository.CrudRepository;

public interface BankingTransactionRepository extends CrudRepository<BankingTransaction, Long> {
}
