package com.jspiders.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jspiders.beans.User;
import com.jspiders.mapper.MyRowMapper;
import com.jspiders.resources.SpringConfigFile;

public class Main 
{
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//		FOR INSERTION
//		String SQL_QUERY="INSERT INTO contact VALUES (?,?,?,?,?)";
//		int res  = jdbcTemplate.update(SQL_QUERY, 1111, "MAHSEH", "KUMAR", 8516030885l, "Home");
		
//		FOR UPDATION
//		String SQL_QUERY="UPDATE contact SET lastName = ? WHERE id = ?";
//		int res  = jdbcTemplate.update(SQL_QUERY, "Prajapati", 1111);
		
//		FOR DELETION
//		String SQL_QUERY="DELETE FROM contact WHERE id = ?";
//		int res  = jdbcTemplate.update(SQL_QUERY, 1111);
//		if (res > 0) {
//			System.out.println("Success");
//		} else {
//			System.out.println("Not Success");
//		}
		
//		FOR SELECTION --> FOR ALL
//		String SQL_QUERY="SELECT * FROM contact";
//		List<User> userList = jdbcTemplate.query(SQL_QUERY, new MyRowMapper());
//		for (Iterator iterator = userList.iterator(); iterator.hasNext();) {
//			User user = (User) iterator.next();
//			System.out.println(user.getId());
//			System.out.println(user.getFirstName());
//			System.out.println(user.getLastName());
//			System.out.println(user.getMobile());
//			System.out.println(user.getCategory());
//			System.out.println("_____________________");
//		}

		
//		FOR SELECTION --> FOR SINGLE
		String SQL_QUERY="SELECT * FROM contact WHERE id = 1111";
		User userList = (User) jdbcTemplate.queryForObject(SQL_QUERY, new MyRowMapper());
		System.out.println(userList.getId());
		System.out.println(userList.getFirstName());
		System.out.println(userList.getLastName());
		System.out.println(userList.getMobile());
		System.out.println(userList.getCategory());
		System.out.println("_____________________");
	}
}
 