package com.jspders.SpringBootSecurity.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jspders.SpringBootSecurity.Entities.User;
import com.jspders.SpringBootSecurity.Repositiory.UserCrudOpeRepo;
import com.jspders.SpringBootSecurity.Services.UserServices;

@Service
public class UserServicesImpl implements UserServices
{
	@Autowired
	private UserCrudOpeRepo userCrudOpeRepo;
	
	private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

	@Override
	public User addUserDetails(User user) 
	{	
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return userCrudOpeRepo.save(user);
	}

	@Override
	public User findUserDetails(String email, String password) 
	{
		User findedUser = userCrudOpeRepo.findByEmail(email);
		if (findedUser!=null && findedUser.getPassword().equals(password)) 
		{
			return findedUser;
		}
		return null;
	}

}
