package com.sygmatech.example.betterbanking.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionServiceTest {

    private TransactionService service = new TransactionService();

    @Test
    void findAllByAccountNumber() {
        assertEquals(3, service.findAllByAccountNumber("335566").size());
    }

}
