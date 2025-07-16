package com.jspders.SpringBootSecurity.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jspders.SpringBootSecurity.Entities.CustomUserDetails;
import com.jspders.SpringBootSecurity.Repositiory.UserCrudOpeRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService
{
	@Autowired
	private UserCrudOpeRepo userCrudOpeRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new CustomUserDetails(userCrudOpeRepo.findByEmail(username));
	}
}
