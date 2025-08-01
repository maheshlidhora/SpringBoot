package com.jspiders.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User 
{
	@Value("101")
	private int id;
	@Value("Mahesh")
	private String name;
	@Value("mahesh@gmail.com")
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display()
	{
		System.out.println("ID : "+id);
		System.out.println("NAME : "+name);
		System.out.println("EMAIL : "+email);
	}
}
