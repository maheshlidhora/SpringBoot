package com.jspders.SpringBootProject.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspders.SpringBootProject.main.entites.Users;
import com.jspders.SpringBootProject.main.repositiory.MyRepositiory;

@Service
public class MyServicesImpl implements MyServices {
	@Autowired
	private MyRepositiory repositiory;

	@Override
	public boolean addUser(Users users) {
		boolean status = false;
		try 
		{
			repositiory.save(users);
			status = true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Users loginUser(String email, String password) {
//		System.out.println(email);
//		System.out.println(password);
		Users validUser = repositiory.findByEmail(email);
//		System.err.println(validUser.getEmail());
//		System.err.println(validUser.getPassword());
		if (validUser != null && validUser.getPassword().equals(password)) {
			System.out.println("Matched");
			return validUser;
		} else {
			System.out.println("Not Matched");
			return null;
		}
	}
}