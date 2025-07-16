package com.jspders.TheOrionWriters.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspders.TheOrionWriters.Entities.Roles;
import com.jspders.TheOrionWriters.Repository.RolesRepository;
import com.jspders.TheOrionWriters.Services.RoleServices;

@Service
public class RoleServicesImpl implements RoleServices
{
	@Autowired
	private RolesRepository rolesRepository;
	@Override
	public boolean addRoleDetails(Roles roles) 
	{
		System.out.println(roles.getRoleId());
		System.out.println(roles.getRoleName());
		try 
		{
			rolesRepository.save(roles);
			return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}

}
