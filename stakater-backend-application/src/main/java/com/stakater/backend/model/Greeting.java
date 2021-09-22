package com.stakater.backend.model;

import org.springframework.beans.factory.annotation.Value;

import lombok.ToString;

@ToString
public class Greeting {
	
	@Value ("${NAME}")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
