package com.stakater.backend;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * 
 * @author mubi
 *
 */
@SpringBootTest
@AutoConfigureMockMvc
public class GreetingControllerMockMvcTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void greetingStatusOkTest() throws Exception {
		this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk());
		// .andExpect(content().string("Stakater"));
	}

}
