package com.madhan.restapp.serviceimpl;

import org.springframework.stereotype.Service;

import com.madhan.restapp.model.User;
import com.madhan.restapp.repository.UserRepo;
import com.madhan.restapp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	UserRepo userRepository;

    public UserServiceImpl(UserRepo userRepository) {
		super();
		this.userRepository = userRepository;
	}


	public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }

   
    public User saveUser(User user) {
        user.setPassword((user.getPassword()));
        return userRepository.save(user);
    }
}
