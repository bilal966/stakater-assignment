package com.stakater.backend.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stakater.backend.service.GreetingService;
/**
 * 
 * @author mubi
 *
 */
@RestController
public class GreetingController {
	
	@Autowired
	private GreetingService greetingService;
	
	@GetMapping(value = "greeting")
	public ResponseEntity<String> getWelcome(){
		return Optional.ofNullable(greetingService.getWelcomeGreeting()).map(g -> new ResponseEntity<String>(g, HttpStatus.OK))
		.orElse(new ResponseEntity<String>("System environment does not contain Name.", HttpStatus.NO_CONTENT));
		
	}

}
