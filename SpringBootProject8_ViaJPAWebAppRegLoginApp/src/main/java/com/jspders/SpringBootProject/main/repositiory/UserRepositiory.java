package com.jspders.SpringBootProject.main.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspders.SpringBootProject.main.entities.User;


public interface UserRepositiory extends JpaRepository<User, Integer> 
{
	User findByEmail(String email);
}
