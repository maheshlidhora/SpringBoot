package com.jspiders.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jspiders.beans.User;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public User user1()
	{
		User user = new User();
		user.setId(101);
		user.setName("Amit");
		user.setEmail("amit@gmail.com");
		return user;
	}
	
//	@Bean("Bean2")
//	public User user2()
//	{
//		User user = new User();
//		user.setId(102);
//		user.setName("Ankit");
//		user.setEmail("ankit@gmail.com");
//		return user;
//	}

}
