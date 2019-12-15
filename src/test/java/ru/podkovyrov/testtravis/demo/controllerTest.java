package ru.podkovyrov.testtravis.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class  controllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    void testHello() throws Exception{

        mvc.perform(
                get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, world!"));

    }

    @Test
    void testHelloWithUsername() throws Exception{

        mvc.perform(
                get("/hello")
                        .param("name", "Neo"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, Neo!"));

    }

}
