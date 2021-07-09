package com.sygmatech.example.betterbanking.util;

import com.acme.banking.model.OBTransaction6;
import com.sygmatech.example.betterbanking.domain.BankingTransaction;
import com.sygmatech.example.betterbanking.domain.Transaction;

import java.util.Optional;
import java.util.function.Function;

public class OBTransactionAdapter {

    public Transaction adapt(final OBTransaction6 transaction6) {
        return transactionFunction.apply(transaction6);
    }

    public BankingTransaction adapt(final Transaction trans) { return bankingTransactionFunction.apply(trans); }

    private final Function<OBTransaction6, Transaction> transactionFunction = obTransaction6 -> {

        var t = new Transaction();
        t.setAccountNumber(Integer.valueOf(obTransaction6.getAccountId()));

        var amount = lift(obTransaction6, o -> Double.valueOf(o.getAmount().getAmount()));
        var fx = lift(obTransaction6, o -> o.getCurrencyExchange().getExchangeRate().doubleValue());
        t.setAmount(amount.orElse(0.0) * fx.orElse(1.0));

        lift(obTransaction6, o -> o.getCurrencyExchange().getUnitCurrency())
                .ifPresent(t::setCurrency);
        lift(obTransaction6, o -> o.getCreditDebitIndicator().toString())
                .ifPresent(t::setType);
        lift(obTransaction6, o -> o.getMerchantDetails().getMerchantName())
                .ifPresent(t::setMerchantName);
        return t;
    };

    private <T> Optional<T> lift(final OBTransaction6 transaction6, Function<OBTransaction6, T> func) {
        try {
            return Optional.of(func.apply(transaction6));
        } catch (Exception ex) {
            return Optional.empty();
        }
    }

    private final Function<Transaction, BankingTransaction> bankingTransactionFunction = transaction -> {

        var t = new BankingTransaction(transaction.getType(), transaction.getAccountNumber(), transaction.getCurrency(),
                transaction.getAmount(), transaction.getMerchantName());

        return t;
    };
}
