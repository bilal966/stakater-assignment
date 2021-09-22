package com.stakater.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class StakaterFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(StakaterFrontendApplication.class, args);
	}
	
	@Bean
    public RestTemplate configureWebClient() {
		RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    };

}
