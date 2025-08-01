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
		address = new Address();
		address.setHouseNo(33);
		address.setCity("Bhopal");
		address.setPinCode(462002);
		return address;
	}
	@Bean
	public User generateUser()
	{
		user = new User();
		user.setId(1001);
		user.setName("Mahesh");
		user.setEmail("mahesh@gmail.com");
//		user.setAddress(generateAddress()); // --> It's Manually DI.
		return user;
	}
}