package com.jspders.SpringBootProject.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspders.SpringBootProject.main.entities.User;
import com.jspders.SpringBootProject.main.services.UserService;

@CrossOrigin("*")
@RestController
public class Controller 
{
	@Autowired
	private UserService service;
	
	@PostMapping("/user")
	public User addUserDetails(@RequestBody User user) 
	{
		return service.addUserDetails(user);
	}
	
	@GetMapping("/user")
	public List<User> showAllUsers() {
		return service.showAllUser();
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> userDetails(@PathVariable int id){
		User user = service.findUserDeatail(id).orElse(null);
		if (user != null) 
		{
			return ResponseEntity.ok().body(user);
		}
		else 
		{
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateDetails(@PathVariable int id, @RequestBody User user) 
	{
		 User upadtedUser = service.updateDetails(id, user);
		 if (upadtedUser != null) 
		 {
			 return ResponseEntity.ok(upadtedUser);
		 } 
		 else 
		 {
			 return ResponseEntity.notFound().build();
		 }
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deleteuser(@PathVariable int id) {
		if (service.deleteUser(id)) 
		{
			return ResponseEntity.ok().body("User Deleted Successfully");
		} 
		else 
		{
			return ResponseEntity.notFound().build();
		}
	}
}
