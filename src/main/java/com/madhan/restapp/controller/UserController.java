package com.madhan.restapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhan.restapp.model.User;
import com.madhan.restapp.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	
	 public UserController(UserService userService) {
			super();
			this.userService = userService;
		}

		UserService userService;


		    @PostMapping("/register")
		    public String register(@RequestBody User user) {
		        User existingUser = userService.findByUserName(user.getUserName());
		        if (existingUser != null) {
		            return "username already exists";
		        }
		        userService.saveUser(user);
		        return "User registered successfully";
		    }

		    @PostMapping("/login")
		    public String login(@RequestBody User user) {
		        User existingUser = userService.findByUserName(user.getUserName());
		        if (existingUser != null && user.getPassword().equals( existingUser.getPassword())) {
		            return "Login successful";
		        } else {
		            return "Invalid credentials";
		        }
		    }

}
