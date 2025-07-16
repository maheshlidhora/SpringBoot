package com.jspiders.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class User 
{
	private int id;
	private String name;
	private String email;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Cources cources;
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setCources(Cources cources) {
		this.cources = cources;
	}
	public void display()
	{
		System.out.println("ID : "+id);
		System.out.println("NAME : "+name);
		System.out.println("EMAIL : "+email);
		System.out.println("ADDRESS : "+ address);
		System.out.println("COURCES : "+ cources);
	}
}
