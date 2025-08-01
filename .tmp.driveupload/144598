package com.jspders.TheOrionWriters.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspders.TheOrionWriters.Entities.Roles;
import com.jspders.TheOrionWriters.Entities.UserWithRole;
import com.jspders.TheOrionWriters.Services.RoleServices;

@RestController
@CrossOrigin("*")
public class RolesController 
{
	@Autowired
	private RoleServices roleServices;	
	
	@PostMapping("/addRole")
	public String addRole(@RequestBody Roles roles) 
	{
		boolean status = roleServices.addRoleDetails(roles);
	    return status ? "Role Registered Successfully!!" : "Role is not Registered.";
	}
}
