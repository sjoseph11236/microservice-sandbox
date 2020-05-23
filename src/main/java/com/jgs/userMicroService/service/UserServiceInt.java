package com.jgs.userMicroService.service;

import java.util.List;

import com.jgs.userMicroService.model.User;

public interface UserServiceInt {
	
	User createUser();
	List<User> findAllUsers();
}
