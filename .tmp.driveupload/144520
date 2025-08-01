package com.jspiders.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jspiders.beans.Address;
import com.jspiders.beans.User;
@Configuration
public class SpringConfigFile 
{
	private Address address;
	private User user;
	@Bean
	public Address generateAddress()
	{
		address = new Address(33, "Bhopal", 462003);
		return address;
	}
	@Bean
	public User generateUser()
	{
		user = new User(103, "Mahesh", "mahesh.lidhora@gmail.com", generateAddress());
		return user;
	}
}
