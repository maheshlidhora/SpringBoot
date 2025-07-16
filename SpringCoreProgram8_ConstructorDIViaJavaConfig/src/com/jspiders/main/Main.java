package com.jspiders.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.beans.User;
import com.jspiders.resources.SpringConfigFile;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		User user = (User) applicationContext.getBean("generateUser");
		user.display();
	}
}
