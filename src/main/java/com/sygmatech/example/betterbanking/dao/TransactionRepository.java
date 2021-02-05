package com.sygmatech.example.betterbanking.dao;

import com.sygmatech.example.betterbanking.domain.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
