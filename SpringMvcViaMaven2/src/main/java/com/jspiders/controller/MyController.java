package com.jspiders.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jspiders.bean.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
	
	@GetMapping("/myForm")
	public String openRegistrationForm()
	{
		return "myForm";
	}

//	FIRST WAY TO GET THE PARAMETER FROM THE HTML PAGE
//	@PostMapping("/reg")
//	public String handleRegistrationForm(HttpServletRequest request) 
//	{
//		String name = request.getParameter("Name");
//		String email = request.getParameter("Email");
//		long contact = Long.parseLong(request.getParameter("Contact"));
//		String  password = request.getParameter("Password");
//		String gender = request.getParameter("Gender");
//		String city = request.getParameter("City");
//		
//		System.out.println(name);
//		System.out.println(email);
//		System.out.println(contact);
//		System.out.println(password);
//		System.out.println(gender);
//		System.out.println(city);
//		
//		return "profile";
//	}
	
	

//	SECOND WAY TO GET AND SEND THE DATA FORM/TO THE HTML PAGE
//	@PostMapping("/reg")
//	public String handleRegistrationForm(
//			@RequestParam("Name") String name,
//			@RequestParam("Email") String email,
//			@RequestParam("Contact") String contact,
//			@RequestParam("Password") String password,
//			@RequestParam("Gender") String gender,
//			@RequestParam("City") String city,
//			Model model ) 
//	{		
//		System.out.println(name);
//		System.out.println(email);
//		System.out.println(contact);
//		System.out.println(password);
//		System.out.println(gender);
//		System.out.println(city);
//		
//		User user = new User();
//		user.setName(name);
//		user.setEmail(email);
//		user.setContact(Long.parseLong(contact));
//		user.setPassword(password);
//		user.setGender(gender);
//		user.setCity(city);
//		model.addAttribute("model_user", user);		
//		return "profile";
//	}
	
	
//	THIRD WAY TO GET AND SEND THE DATA FORM/TO THE HTML PAGE
	@PostMapping("/reg")
	public String handleRegistrationForm(@ModelAttribute User user) 
	{		
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getContact());
		System.out.println(user.getPassword());
		System.out.println(user.getGender());
		System.out.println(user.getCity());
		return "profile";
	}
}
