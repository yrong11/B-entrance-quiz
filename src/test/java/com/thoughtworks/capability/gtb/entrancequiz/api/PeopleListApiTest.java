package com.thoughtworks.capability.gtb.entrancequiz.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class PeopleListApiTest {

    @Autowired
    MockMvc mockMvc;

    @BeforeEach
    void setup() {

    }
    @Test
    public void should_return_list_when_get_people_list() throws Exception {
        mockMvc.perform(get("/peoples"))
                .andExpect(status().isOk());
    }

}