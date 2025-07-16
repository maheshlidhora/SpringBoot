package com.jspders.SpringBootSecurity.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspders.SpringBootSecurity.Entities.User;
import java.util.List;


public interface UserCrudOpeRepo extends JpaRepository<User, Integer>
{
	public User findByEmail(String email);
}
