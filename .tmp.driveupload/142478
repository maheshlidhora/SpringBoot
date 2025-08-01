package com.jspders.SpringBootSecurity.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.jspders.SpringBootSecurity.Entities.User;
import com.jspders.SpringBootSecurity.Services.UserServices;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@CrossOrigin("*")
@RequestMapping("/user")
public class UserWebController 
{
	@Autowired
	private UserServices userServices;
	
    @GetMapping("/")
    public RedirectView index() {
        return new RedirectView("./index.html");
    }
    
	@GetMapping("/regPage")
	public String openRegForm(Model model) 
	{
		model.addAttribute("addUser", new User());
		return "register";
	}

	@GetMapping("/logPage")
	public String openLoginForm(Model model) 
	{
		model.addAttribute("loginUser", new User());
		return "login";
	}
	
	@GetMapping("/logout")
	public String logoutUser(HttpServletRequest httpServletRequest)
	{
		HttpSession session = httpServletRequest.getSession();
		if (session != null) 
		{
			session.invalidate();
			System.out.println("User is Logged Out!!");
		}
		return "redirect:/user/logPage";
	}
	
	@PostMapping("/submitRegForm")
	public String doRegister(@ModelAttribute("addUser") User user)
	{
		User newUser = userServices.addUserDetails(user);
		if (newUser!=null) {
			System.out.println("Register Successfully");
			return "redirect:/user/logPage";
		} else {
			System.out.println("Not Register");
			return "redirect:/user/regPage";
		}
	}
	
	@PostMapping("/submitLogForm")
	public String submitLogin(@ModelAttribute("loginUser") User user, Model model, HttpServletRequest httpServletRequest) 
	{
		User validUser = userServices.findUserDetails(user.getEmail(), user.getPassword());
		HttpSession session = httpServletRequest.getSession();
		if (validUser!=null) {
			model.addAttribute("user", validUser);
			model.addAttribute("sessionId", session.getId());
//			model.addAttribute("userToken", UserRestController.csrf(token).getToken());
			return "profile";
		}
		else {
			model.addAttribute("errorMsg", "User is Not Found!");
			return "login";
		}
	}
}
