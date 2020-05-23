package com.jgs.userMicroService.service;

import java.util.List;

import com.jgs.userMicroService.model.User;

public interface UserServiceInt {
	
//	User createUser();
	void createUser(User user);
	List<User> findAllUsers();
	User findUserById(Long id);
	void deleteUserById(Long id);
	void updateUserById(Long id, User user);
}
