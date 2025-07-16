package com.jspders.SpringBootSecurity.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin("*")
public class EventController 
{
	@GetMapping("/failed")
	public String failedOperation()
	{
		return "failed";
	}
}
