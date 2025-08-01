package com.jspders.SpringBootJdbcCrud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jspders.SpringBootJdbcCrud.entity.User;

@Repository
public class UserDao 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
//	FRO INSERT, UPDATE & DELETE, THE LOGIC WILL BE SAME;
	public boolean InsertUser(User user) {
		try {
			int res = jdbcTemplate.update("INSERT INTO contact VALUES (?,?,?,?,?)", user.getId(), user.getFirstName(), user.getLastName(), user.getMobile(), user.getCategory());
			if (res>0) 
			{
				return true;
			} 
			else 
			{
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
	}

//	FRO SELECT A SINGLE USER;
	public User SelectUser(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM contact WHERE id = ?", new UserRowmapper(), id); 
	}
	 
	public static final class UserRowmapper implements RowMapper<User>{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setFirstName(rs.getString("firstName"));
			user.setLastName(rs.getString("lastName"));
			user.setMobile(rs.getLong("mobile"));
			user.setCategory(rs.getString("category"));
			return user;
		}
		
	}

//	FRO SELECT A ALL USERS;
	public List<User> SelectAllUser() {
		return jdbcTemplate.query("SELECT * FROM contact", new UserRowmapper()); 
	}
}


