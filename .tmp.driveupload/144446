package com.jspiders.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.beans.User;
import com.jspiders.resource.SpringConfigFile;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
//		First Way:
		User user1 = (User) context.getBean("user1");
		user1.display();
	}
}
