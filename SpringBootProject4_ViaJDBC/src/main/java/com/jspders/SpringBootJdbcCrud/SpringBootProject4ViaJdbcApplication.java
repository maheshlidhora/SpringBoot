package com.jspders.SpringBootJdbcCrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jspders.SpringBootJdbcCrud.dao.UserDao;
import com.jspders.SpringBootJdbcCrud.entity.User;

@SpringBootApplication
public class SpringBootProject4ViaJdbcApplication implements CommandLineRunner {

	@Autowired
	private UserDao userDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject4ViaJdbcApplication.class, args);
	}
//	FRO INSERT, UPDATE & DELETE;
//	@Override
//	public void run(String... args) throws Exception {
//		User user1 = new User(1234, "ANIL", "PRAJAPATI", 8907651234l, "Salesman");
//		if (userDao.InsertUser(user1)) 
//		{
//			System.out.println("User Inserted Successfully!!");
//		} 
//		else 
//		{
//			System.out.println("User Not Inserted Due to Some Error!!");
//		}
//	}  
	
//	FRO SELECT A SINGLE USER;
//	@Override
//	public void run(String... args) throws Exception {
//		User user = userDao.SelectUser(1111);
//		System.out.println(user.getId());
//		System.out.println(user.getFirstName());
//		System.out.println(user.getLastName()); 
//		System.out.println(user.getMobile());
//		System.out.println(user.getCategory());
//	}

//	FRO SELECT A ALL USERS;
	@Override
	public void run(String... args) throws Exception {
		List<User> users = userDao.SelectAllUser();
		for (User user : users) {
//			System.err.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
			System.out.println(user.getId());
			System.out.println(user.getFirstName());
			System.out.println(user.getLastName());
			System.out.println(user.getMobile());
			System.out.println(user.getCategory());
			System.err.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		}
	}
}
