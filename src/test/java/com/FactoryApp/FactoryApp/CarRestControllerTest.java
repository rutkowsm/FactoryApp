package com.FactoryApp.FactoryApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CarRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldPrintHelloWorld() throws Exception {
        mockMvc.perform(get("/cars"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"));

    }

    @Test
    void isCarFound() throws Exception {
        mockMvc.perform(get("/cars/show"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("{\"id\":1,\"brand\":\"Subaru\",\"model\":\"Outback\",\"wheels\":4,\"capacity\":500,\"vin\":\"BBD56431232\",\"colour\":\"Black\"}"));
    }

}
