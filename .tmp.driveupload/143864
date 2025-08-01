package com.jspiders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage()
	{
		System.out.println("openHelloPage() method Executed!");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		
//		Second Way without setViewName:
//		ModelAndView modelAndView = new ModelAndView("hello");
		
		return modelAndView;
	}
	
	@GetMapping("/about")
	public String openAboutUsPage()
	{
		return "about";
	}
}
