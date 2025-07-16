package com.jspders.SpringBootProject.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jspders.SpringBootProject.main.entites.Users;
import com.jspders.SpringBootProject.main.services.MyServices;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController 
{
	@Autowired
	private MyServices services;
	
	@GetMapping("/regPage")
	public String openRegForm(Model model) 
	{
		model.addAttribute("addUser", new Users());
		return "register";
	}
	
	@PostMapping("/regForm")
	public String submitRegitraion(@ModelAttribute("addUser") Users users, Model model) 
	{
		boolean status = services.addUser(users);
		if (status) 
		{
			model.addAttribute("successMsg", "User Registerd Successfully!!");
		} 
		else 
		{
			model.addAttribute("errorMsg", "User is not Registerd due to Some Errors!!");
		}
		return "register";
	}
	
	@GetMapping("/logPage")
	public String openLogForm(Model model) 
	{
		model.addAttribute("loginUser", new Users());
		return "login";
	}
	
	@PostMapping("/logForm")
	public String submitLogin(@ModelAttribute("loginUser") Users users, Model model) 
	{
		Users validUser = services.loginUser(users.getEmail(), users.getPassword());
		if (validUser!=null) {
			model.addAttribute("modelName", validUser.getName());
			return "profile";
		}
		else {
			model.addAttribute("errorMsg", "User is Found!");
			return "login";
		}
	}
	
	@GetMapping("/logout")
	public String logoutOperation(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		return "redirect:/logPage";	
	}

}
