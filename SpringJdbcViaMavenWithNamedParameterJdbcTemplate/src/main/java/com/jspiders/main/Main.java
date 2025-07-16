package com.jspiders.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.jspiders.resources.SpringConfig;

public class Main 
{
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		NamedParameterJdbcTemplate jdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
//		FOR INSERTION
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("myID", 2222);
		map.put("myFName", "AMIT");
		map.put("myLName", "Kumar");
		map.put("myMobile", 7896541230l);
		map.put("myCategory", "Brother");
		String SQL_QUERY="INSERT INTO contact VALUES (:myID,:myFName,:myLName,:myMobile,:myCategory)";
		int res  = jdbcTemplate.update(SQL_QUERY, map);
		if (res > 0) {
		System.out.println("Success");
		} else {
			System.out.println("Not Success");
		}	
		
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
//		String SQL_QUERY="SELECT * FROM contact WHERE id = 1111";
//		User userList = (User) jdbcTemplate.queryForObject(SQL_QUERY, new MyRowMapper());
//		System.out.println(userList.getId());
//		System.out.println(userList.getFirstName());
//		System.out.println(userList.getLastName());
//		System.out.println(userList.getMobile());
//		System.out.println(userList.getCategory());
//		System.out.println("_____________________");
	}
}
 