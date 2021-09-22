package com.stakater.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 
 * @author mubi
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class StakaterBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(StakaterBackendApplication.class, args);
	}

}
