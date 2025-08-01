package com.jspders.SpringBootProject.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jspders.SpringBootProject.main.entities.User;
import com.jspders.SpringBootProject.main.services.UserServices;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController 
{
	@Autowired
	private UserServices services;
	
	@GetMapping("/regPage")
	public String OpenRegPage(Model model) 
	{
		model.addAttribute("userADD",new User());
		return "register";
	}
	
	@PostMapping("/regForm")
	public String submitRegisterForm(@ModelAttribute("userADD") User user, Model model) 
	{
		boolean Status = services.registerUser(user);
		if (Status) 
		{
			model.addAttribute("successMsg", "User Registerd Successfully!");
		} 
		else 
		{
			model.addAttribute("errorMsg", "User is Not Registerd Due to Some Error!");
		}
		return "register";
	}
	
	@GetMapping("/loginPage")
	public String OpenLogPage(Model model) 
	{
		model.addAttribute("userLoginDetail", new User());
		return "login";
	}
	
	@PostMapping("/logForm")
	public String submitLoginForm(@ModelAttribute("userLoginDetail") User user, Model model) 
	{
		User validUser = services.loginUser(user.getEmail(), user.getPassword());
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
	public String logoutButton(HttpServletRequest request) 
	{
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		return "login";
	}
}
