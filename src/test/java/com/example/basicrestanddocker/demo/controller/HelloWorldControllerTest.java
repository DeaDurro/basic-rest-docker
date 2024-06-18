package com.example.basicrestanddocker.demo.controller;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.basicrestanddocker.BasicRestAndDockerApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnHelloWorld() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/helloworld"))
                .andReturn();
        String content = result.getResponse().getContentAsString();
        assertThat(content).contains("Hello World");
    }
}
