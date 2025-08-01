package com.jspiders.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.beans.User;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/jspiders/resource/applicationContext.xml");
		User user1 = (User) context.getBean("user");
		user1.display();
	}
}
