package com.stakater.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
/**
 * 
 * @author mubi
 *
 */
@Service
public class GreetingService {
	
	@Autowired
	private Environment env;
	
	public String getWelcomeGreeting() {
		return env.getProperty("NAME");
	}

}
