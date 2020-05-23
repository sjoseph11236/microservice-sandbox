package com.jgs.userMicroService.service;

import org.springframework.stereotype.Service;

import com.jgs.userMicroService.model.User;

@Service
public class UserServiceImpl implements UserServiceInt{
	
	@Override
	public User createUser() {
		return new User("Sayeed", "sayeed@email.com", "admin");
	}
}
