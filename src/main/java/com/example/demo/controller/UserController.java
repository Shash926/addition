package com.example.demo.controller;
//no changes
//CONTROLLER FILE
//updated
// this is usercontroller file
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.service.UserService;
//
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/addusers")
	public User adduser(@RequestBody User user) {
		return userservice.adduser(user);
		
	}
	
	
}
