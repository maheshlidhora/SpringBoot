package com.jspiders.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class Register extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("Name");
		String email = request.getParameter("Email");
		long contact = Long.parseLong(request.getParameter("Contact"));
		String  password = request.getParameter("Password");
		String gender = request.getParameter("Gender");
		String city = request.getParameter("City");
		
		Connection conn = MyDBController.getConnection();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try 
		{
			String SQL_Query = "INSERT INTO RegLogProjectUsingJSP VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(SQL_Query);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setLong(3, contact);
			ps.setString(4, password);
			ps.setString(5, gender);
			ps.setString(6, city);
			int res = ps.executeUpdate();
			if (res>0) 
			{
				out.print("<h1 style=\"color: green;\">Inserted</h1>");
				RequestDispatcher rd = request.getRequestDispatcher("./login.html");
				rd.include(request, response);
			} 
			else 
			{
				out.print("<h1 style=\"color: red;\">Not Inserted</h1>");
				RequestDispatcher rd = request.getRequestDispatcher("./register.html");
				rd.include(request, response);
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
