package com.jspders.SpringBootProject.main.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspders.SpringBootProject.main.entites.Users;


public interface MyRepositiory extends JpaRepository<Users, Integer>
{
	Users findByEmail(String email);
}
