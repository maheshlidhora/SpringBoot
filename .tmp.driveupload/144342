package com.jspders.SpringBootProject.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspders.SpringBootProject.main.entities.User;
import com.jspders.SpringBootProject.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	private UserRepository repository;

	@Override
	public User addUserDetails(User user) 
	{
		return repository.save(user);
	}

	@Override
	public List<User> showAllUser() 
	{
		return repository.findAll();
	}

	@Override
	public Optional<User> findUserDeatail(int id) {
		
		return repository.findById(id);
	}

	@Override
	public User updateDetails(int id, User newUser) {
		User userData = repository.findById(id).orElse(null);
		if (userData != null) 
		{
			return repository.save(newUser);
		} 
		else 
		{
			throw new RuntimeException("User Not Found!! ID :: "+id );
		}
	}

	@Override
	public boolean deleteUser(int id) 
	{
		User userData = repository.findById(id).orElse(null);
		if (userData != null) 
		{
			repository.deleteById(id);
			return true;
		} 
		else 
		{
			throw new RuntimeException("User Not Found!! ID :: "+id );
		}
	}
}
