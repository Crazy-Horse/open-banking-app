package com.sygmatech.example.betterbanking.util;

import com.sygmatech.example.betterbanking.domain.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class OBTransactionAdapterTest {

    final OBTransactionAdapter adapter = new OBTransactionAdapter();

    @Test
    public void whenCreatesIncompleteTransaction_thenCorrect() {
        var transaction = new OBTransaction6();
        transaction.setAccountId("55555");
        transaction.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
        transaction.setAmount(amount());

        assertThrows(IllegalArgumentException.class, (Executable) adapter.adapt(transaction));
    }

    @Test
    public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
        OBTransaction6 transaction = new OBTransaction6();
        transaction.setAccountId("55555");

        transaction.setCreditDebitIndicator(OBCreditDebitCode1.CREDIT);

        OBCurrencyExchange5 currencyExchange = new OBCurrencyExchange5();
        currencyExchange.exchangeRate(new BigDecimal("8888.66666")).unitCurrency("USD");
        transaction.setCurrencyExchange(currencyExchange);


        OBActiveOrHistoricCurrencyAndAmount9 currencyAndAmount = new OBActiveOrHistoricCurrencyAndAmount9();
        currencyAndAmount.setAmount("50.88");
        transaction.setAmount(currencyAndAmount);

        var trans = adapter.adapt(transaction);
        assertEquals(transaction.getAccountId(), trans.getAccountNumber());
    }

    @Test
    public void testNullMerchant() {
        var ob = new OBTransaction6();
        ob.setAccountId("1234567");
        ob.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
        ob.setAmount(amount());
        var t = adapter.adapt(ob);
        assertNull(t.getMerchantName());
    }

    @Test
    public void testMerchant() {
        var ob = new OBTransaction6();
        ob.setAccountId("1234567");
        ob.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
        ob.setAmount(amount());
        ob.setMerchantDetails(merchantDetails());
        var t = adapter.adapt(ob);
        assertEquals("acme", t.getMerchantName());
    }

    @Test
    public void testInvalidAmount() {
        var ob = new OBTransaction6();
        ob.setAccountId("1234567");
        ob.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
        ob.setAmount(invalidAmount());
        var t = adapter.adapt(ob);
        assertEquals(0.0d, t.getAmount());
    }

    @Test
    public void testAmount() {
        var ob = new OBTransaction6();
        ob.setAccountId("1234567");
        ob.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
        ob.setAmount(amount());
        var t = adapter.adapt(ob);
        assertEquals(100.0d, t.getAmount());
    }

    private OBActiveOrHistoricCurrencyAndAmount9 amount() {
        var amount = new OBActiveOrHistoricCurrencyAndAmount9();
        amount.setAmount("100.00");
        amount.setCurrency("USD");
        return amount;
    }

    private OBActiveOrHistoricCurrencyAndAmount9 invalidAmount() {
        var amount = new OBActiveOrHistoricCurrencyAndAmount9();
        amount.setCurrency("100.00");
        amount.setAmount("USD");
        return amount;
    }

    private OBMerchantDetails1 merchantDetails() {
        var m = new OBMerchantDetails1();
        m.setMerchantName("acme");
        m.setMerchantCategoryCode("25");
        return m;
    }
}
