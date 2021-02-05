package com.sygmatech.example.betterbanking.util;

import com.sygmatech.example.betterbanking.domain.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class OBTransactionAdapterTest {

    @Test
    public void whenCreatesIncompleteTransaction_thenCorrect() {
        OBTransaction6 transaction = new OBTransaction6();
        transaction.setAccountId("55555");
        Optional<Transaction> trans = OBTransactionAdapter.transform(transaction);
        assertFalse(trans.isPresent());
    }

    @Test
    public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
        OBTransaction6 transaction = new OBTransaction6();
        transaction.setAccountId("55555");

        transaction.setCreditDebitIndicator(OBCreditDebitCode1.CREDIT);

        OBCurrencyExchange5 currencyExchange = new OBCurrencyExchange5();
        currencyExchange.exchangeRate(new BigDecimal(8888.66666)).unitCurrency("USD");
        transaction.setCurrencyExchange(currencyExchange);


        OBActiveOrHistoricCurrencyAndAmount9 currencyAndAmount = new OBActiveOrHistoricCurrencyAndAmount9();
        currencyAndAmount.setAmount("50.88");
        transaction.setAmount(currencyAndAmount);

        Optional<Transaction> trans = OBTransactionAdapter.transform(transaction);
        assertTrue(trans.isPresent());
        assertEquals(transaction.getAccountId(), trans.get().getAccountNumber());
    }
}
