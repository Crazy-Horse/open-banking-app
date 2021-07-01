package com.sygmatech.example.betterbanking.web;

import com.sygmatech.example.betterbanking.domain.Transaction;
import com.sygmatech.example.betterbanking.service.TransactionService;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@WebMvcTest
public class TransactionControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TransactionService service;

    private static final String CLIENT_ID = "better-banking.io";
    private static final String CLIENT_SECRET = "DHmn6yjQRWcCNA9P";

    @Ignore
    @Test
    public void getAllTransactionsByAccountNumber() throws Exception {
        //when(service.findAllByAccountNumber("55555")).thenReturn();
        this.mockMvc.perform(get("/transactions/234567")).andDo(print()).andExpect(status().isOk())
                .andExpect(model().attribute("amount", contains(30.25, 100.25, 200.25)));
    }

    @Ignore
    @Test
    public void testTransactions() throws Exception {
        doReturn(List.of(new Transaction())).when(service).findAllByAccountNumber(anyInt());

        mockMvc.perform(
                get("/transactions/12345678"))
                .andExpect(status().isOk());
    }

    @Test
    public void testUnauthenticatedTransactions() throws Exception {
        doReturn(List.of(new Transaction())).when(service).findAllByAccountNumber(anyInt());

        mockMvc.perform(
                get("/transactions/123456"))
                .andExpect(status().isUnauthorized());
    }

    @Test
    public void testAuthenticatedTransactions() throws Exception {
        String accessToken = obtainAccessToken("nathan", "abc");

        mockMvc.perform(get("/transactions/123456")
                .header("Authorization", "Bearer " + accessToken)
                .accept("application/json;charset=UTF-8"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(status().is2xxSuccessful());
    }

    private String obtainAccessToken(String username, String password) throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("grant_type", "password");
        params.add("client_id", "better-banking.io");
        params.add("username", username);
        params.add("password", password);

        ResultActions result
                = mockMvc.perform(post("/oauth/token")
                .params(params)
                .with(httpBasic(CLIENT_ID, CLIENT_SECRET))
                .accept("application/json;charset=UTF-8"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"));

        String resultString = result.andReturn().getResponse().getContentAsString();

        JacksonJsonParser jsonParser = new JacksonJsonParser();
        return jsonParser.parseMap(resultString).get("access_token").toString();
    }
}
