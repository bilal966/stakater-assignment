package com.stakater.frontend.controller;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
/**
 * 
 * @author mubi
 *
 */
@Controller
public class GreetingController {
	
	private static final Logger log = LogManager.getLogger(GreetingController.class);
	private final String URL_GREETING_SERVICE = "http://localhost:8080/greeting";
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping({ "/", "/welcome" })
	public String welcome(Model model) {
		log.info("Executing welcome endpoint for view.");
		final ResponseEntity<String> serviceResponse = restTemplate.getForEntity(URL_GREETING_SERVICE, String.class);
		log.info(serviceResponse.getStatusCode());
		log.info(serviceResponse.getBody());
		if(serviceResponse.getStatusCode().equals(HttpStatus.OK)) {
			model.addAttribute("name", serviceResponse.getBody());
		} else {
			model.addAttribute("name", "Guest");
		}
		
		model.addAttribute("current_localDateTime", LocalDateTime.now());
		return "welcome";
	}

}
