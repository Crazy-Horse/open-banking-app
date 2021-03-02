package com.sygmatech.example.betterbanking.web;

import com.sygmatech.example.betterbanking.domain.Transaction;
import com.sygmatech.example.betterbanking.service.TransactionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@WebMvcTest
public class TransactionControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TransactionService service;

    @Test
    public void getAllTransactionsByAccountNumber() throws Exception {
        //when(service.findAllByAccountNumber("55555")).thenReturn();
        this.mockMvc.perform(get("/transactions/234567")).andDo(print()).andExpect(status().isOk())
                .andExpect(model().attribute("amount", contains(30.25, 100.25, 200.25)));
    }

    @Test
    public void testTransactions() throws Exception {
        doReturn(List.of(new Transaction("deposit", "00023456", "USD", 30.25, "Acme"))).when(service).findAllByAccountNumber(anyString());

        mockMvc.perform(
                get("/transactions/12345678"))
                .andExpect(status().isOk());
    }

}
