package com.stakater.backend;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.env.Environment;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StakaterRestTemplateTest {

	@LocalServerPort
	private int port;
	
	@Autowired
	private Environment env;
	private String url;

	@Autowired
	private TestRestTemplate restTemplate;

	@BeforeEach
	public void setup() {
		url = String.format("http://localhost:%d/greeting", port);
	}

	@Test
	public void greetingSuccessTest() {
		String expectedResult = env.getProperty("name");
		assertThat(this.restTemplate.getForObject(url, String.class)).contains(expectedResult);
	}
}
