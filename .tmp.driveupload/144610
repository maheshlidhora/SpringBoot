package com.jspders.TheOrionWriters.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspders.TheOrionWriters.Entities.Roles;
import java.util.List;


public interface RolesRepository extends JpaRepository<Roles, Long> 
{
	List<Roles> findByRoleName(String roleName);
}
