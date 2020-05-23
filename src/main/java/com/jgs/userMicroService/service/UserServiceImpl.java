package com.jgs.userMicroService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jgs.userMicroService.model.User;
import com.jgs.userMicroService.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceInt{
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	} 
	
//	@Override
//	public User createUser() {
//		User userToBeSaved = new User("Sayeed", "sayeed@email.com", "admin");
////		This will save it with an id to the database.
////		saved in memory which h2 default place from storage.
//		User savedUser = userRepository.save(userToBeSaved);
//			
//		return savedUser;
//	}
	
	@Override
	public void createUser(User user) {
		userRepository.save(user);
	}
	
	@Override
	public User findUserById(Long id) {
		return userRepository.findUserById(id);
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}
	
	@Override
	public void updateUserById(Long id, User userChanges) {
		User userFromDb = userRepository.findUserById(id);
		
		userFromDb.setName(userChanges.getName());
		userFromDb.setEmail(userChanges.getEmail());
		userFromDb.setRole(userChanges.getRole());
		
		userRepositry.save(userFromDb);
	}
	
}
