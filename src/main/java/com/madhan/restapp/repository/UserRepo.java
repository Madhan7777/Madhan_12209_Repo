package com.madhan.restapp.repository;

import org.springframework.stereotype.Repository;

import com.madhan.restapp.model.User;

@Repository
public interface UserRepo {

	public User findByUserName(String userName);
	 
	public User save(User user);
}
