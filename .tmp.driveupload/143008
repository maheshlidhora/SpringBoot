package com.jspders.ViaHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jspders.ViaHibernate.entity.User;
import com.jspders.ViaHibernate.repositiory.DBOperations;

@SpringBootApplication
public class SpringBootProject5ViaHibernateApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootProject5ViaHibernateApplication.class, args);	
		DBOperations dbOperations = context.getBean(DBOperations.class);
		User user = dbOperations.getUserDetails(1);
		System.out.println(user.getId());
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getMobile());
		System.out.println(user.getCategory());
	}
}