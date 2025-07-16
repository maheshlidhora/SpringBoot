package com.jspiders.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDBController 
{
	public static Connection getConnection() 
	{
		Connection connection = null;
		try  
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/USER","root","78789899");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return connection;
	}
	
	
}
