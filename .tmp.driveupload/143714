package com.jspders.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController 
{
	@GetMapping("/")
	@ResponseBody
//	@ResponseBody is an annotation in Spring Framework (part of Spring MVC) that tells a controller method 
//	to return the value directly in the HTTP response body, instead of resolving it to a view (like a JSP page or a Thymeleaf template).
	public String PrintHello()
	{
		return "<h1 style=\"color: green;\">Hello User</h1>";
	}
}
 