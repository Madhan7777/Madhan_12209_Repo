package com.madhan.restapp.service;

import org.springframework.stereotype.Service;

import com.madhan.restapp.model.User;

@Service
public interface UserService {

	 User saveUser(User user);
		User findByUserName(String userName);
}
