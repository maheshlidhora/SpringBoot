package com.jspders.TheOrionWriters.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspders.TheOrionWriters.Entities.Users;
import com.jspders.TheOrionWriters.Repository.RolesRepository;
import com.jspders.TheOrionWriters.Repository.UsersRepository;
import com.jspders.TheOrionWriters.Services.UserServices;

@Service
public class UserServicesImpl implements UserServices {
	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private RolesRepository rolesRepository;

	@Override
	public boolean addUserDetails(Users users) {
//		Users addUser = userWithRole.getUsers();
//		Roles addRole = userWithRole.getRoles();
//		System.out.println("Username : "+addUser.getUsername());
//		System.out.println("Rolename : "+ addRole.getRoleName());
//		if (rolesRepository.findById(addRole.getRoleId()) != null) 
//		{
//			try 
//			{
//				Set<Roles> roleList = new HashSet<>();				
//				roleList.add(addRole);
//				addUser.setRoles(roleList);
//				usersRepository.save(addUser);
//				return true;
//			} 
//			catch (Exception e) 
//			{
//				e.printStackTrace();
//				return false;
//			}
//		} 
//		else 
//		{
//			System.out.println("User Role is not Matched!!");
//			return false;
//		}		
		try {
			usersRepository.save(users);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}
