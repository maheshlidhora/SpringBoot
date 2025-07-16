package com.jspiders.SpringMaven.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.SpringMaven.beans.User;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/jspiders/SpringMaven/resources/applicationContext.xml");
		User user = (User) context.getBean("user");
		user.display();
	}
}
