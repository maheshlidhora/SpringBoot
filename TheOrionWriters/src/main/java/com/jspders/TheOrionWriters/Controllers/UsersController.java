package com.jspders.TheOrionWriters.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspders.TheOrionWriters.Entities.UserWithRole;
import com.jspders.TheOrionWriters.Entities.Users;
import com.jspders.TheOrionWriters.Services.UserServices;

@RestController
@CrossOrigin("*")
//@RequestMapping("/User/Roles")
public class UsersController 
{
	@Autowired
	private UserServices userServices;
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody Users users) 
	{
		boolean status = userServices.addUserDetails(users);
	    return status ? "User Registered Successfully!!" : "User is not Registered";
	}
}
