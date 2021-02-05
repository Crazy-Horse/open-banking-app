package com.sygmatech.example.betterbanking.util;

import com.sygmatech.example.betterbanking.domain.OBTransaction6;
import com.sygmatech.example.betterbanking.domain.Transaction;

import java.util.Optional;

public class OBTransactionAdapter {

    public OBTransactionAdapter() {
    }

    public static Optional<Transaction> transform(OBTransaction6 trans) {
        if (trans.getCurrencyExchange() != null) {
            Transaction transaction = new Transaction(trans.getCreditDebitIndicator().toString(), trans.getAccountId(), trans.getCurrencyExchange().getUnitCurrency(),Double.parseDouble(trans.getAmount().getAmount()) * trans.getCurrencyExchange().getExchangeRate().doubleValue(),
                    trans.getMerchantDetails().getMerchantName(), null);
            return Optional.of(transaction);
        }
        return Optional.empty();
    }
}
