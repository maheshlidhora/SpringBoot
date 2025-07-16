package com.jspders.SpringBootProject.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MyController 
{
	@GetMapping
	public String getData(HttpServletRequest request) 
	{
		return "Hello "+ request.getSession().getId();
	}
}
