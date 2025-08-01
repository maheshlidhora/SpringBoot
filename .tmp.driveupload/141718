package com.jspders.SpringBootProject.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspders.SpringBootProject.main.entities.User;
import com.jspders.SpringBootProject.main.repositiory.UserRepositiory;

@Service
public class UserServicesImpl implements UserServices 
{
	@Autowired
	private UserRepositiory repositiory;

	@Override
	public boolean registerUser(User user) 
	{
		boolean status = false;
		try 
		{
			repositiory.save(user);
			status = true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public User loginUser(String email, String password) {
		User validUser = repositiory.findByEmail(email);
		if (validUser != null && validUser.getPassword().equals(password)) {
			System.out.println("Matched");
			return validUser;
		} else {
			System.out.println("Not Matched");
			return null;
		}
	}



}
