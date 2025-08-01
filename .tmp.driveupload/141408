package com.jspders.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerTestApplication.class, args);
	}
	
	@GetMapping("/text")
	public String getHello() 
	{
		return "HELLO";
	}
}
