package com.stakater.backend;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@ExtendWith(MockitoExtension.class)
class StakaterBackendApplicationTests {
	@Mock
	private StakaterBackendApplication backendApplication;
	@Test
	void contextLoads() {
	}
	@Test
	public void mainApp() {
		backendApplication.main(new String[] {"args"});
		
	}
}
