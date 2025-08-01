package com.jspiders.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/log")
public class Login extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email = request.getParameter("Email");
		String  password = request.getParameter("Password");
		
		Connection conn = MyDBController.getConnection();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try 
		{
			String SQL_Query = "SELECT * FROM RegLogProjectUsingJSP WHERE email = ? AND password = ?";
			PreparedStatement ps = conn.prepareStatement(SQL_Query);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet res = ps.executeQuery();
			if (res.next()) 
			{
				out.print("<h1 style=\"color: green;\">Verified</h1>");
			} 
			else 
			{
				out.print("<h1 style=\"color: red;\">Not Verified</h1>");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			if (conn != null) 
			{
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}