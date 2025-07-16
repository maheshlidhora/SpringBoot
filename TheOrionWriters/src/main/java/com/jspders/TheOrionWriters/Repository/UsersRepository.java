package com.jspders.TheOrionWriters.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspders.TheOrionWriters.Entities.Users;
import java.util.List;


public interface UsersRepository extends JpaRepository<Users, Long> 
{
	List<Users> findByUsername(String username);
}
