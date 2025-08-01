package com.jspders.SpringBootSecurity.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspders.SpringBootSecurity.Entities.User;
import com.jspders.SpringBootSecurity.Services.UserServices;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserRestController 
{
	@Autowired
	private UserServices userServices;
	
    @GetMapping("/csrf-Token")
    public CsrfToken csrf(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
    
	@PostMapping("/doRegistration")
	public User doRegistration(@RequestBody User user)
	{
		return userServices.addUserDetails(user);
	}
	
	@PostMapping("/doLogin")
	public User doLogin(@RequestBody User user) 
	{
		return userServices.findUserDetails(user.getEmail(), user.getPassword());
	}
}
