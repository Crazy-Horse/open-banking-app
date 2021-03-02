package com.sygmatech.example.betterbanking.util;

import com.sygmatech.example.betterbanking.domain.OBTransaction6;
import com.sygmatech.example.betterbanking.domain.Transaction;

import java.util.Optional;
import java.util.function.Function;

public class OBTransactionAdapter {

    public Transaction adapt(final OBTransaction6 transaction6) {
        return transactionFunction.apply(transaction6);
    }

    private Function<OBTransaction6, Transaction> transactionFunction = obTransaction6 -> {

        var amount = lift(obTransaction6, o -> Double.valueOf(o.getAmount().getAmount()));
        var fx = lift(obTransaction6, o -> o.getCurrencyExchange().getExchangeRate().doubleValue());
        var currency = lift(obTransaction6, o -> obTransaction6.getCurrencyExchange().getUnitCurrency())
                .orElseThrow(IllegalArgumentException::new);
        var type = lift(obTransaction6, o -> obTransaction6.getCreditDebitIndicator().toString())
                .orElseThrow(IllegalArgumentException::new);
        var name = lift(obTransaction6, o -> obTransaction6.getMerchantDetails().getMerchantName())
                .orElseThrow(IllegalArgumentException::new);

        return new Transaction(type, obTransaction6.getAccountId(), currency, amount.orElse(0.0) * fx.orElse(1.0),
                name);
    };

    private <T> Optional<T> lift(final OBTransaction6 transaction6, Function<OBTransaction6, T> func) {
        try {
            return Optional.of(func.apply(transaction6));
        } catch (Exception ex) {
            return Optional.empty();
        }
    }
}
