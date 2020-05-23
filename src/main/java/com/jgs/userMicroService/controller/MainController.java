package com.jgs.userMicroService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jgs.userMicroService.model.User;
import com.jgs.userMicroService.service.UserServiceImpl;

//Annotation for API
@RestController
public class MainController {
	
//	High coupling
//	UserServiceImpl userServiceImpl = new UserServiceImpl();
	
//	low coupling - spring is creating the new instance
	@Autowired
	UserServiceImpl userServiceImpl;
	
//	GET Request for path of root
	@GetMapping("/")
	public String index() {
////		SHAPELESS DATA
////		Map <String, String> user = new HashMap<>();
////		user.put("name", "Sayeed");
////		user.put("email", "sayeed@email.com");
////		user.put("role", "admin");
////		Business Logic
//		
//		User user = userServiceImpl.createUser();
	
		return "Home Page";
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return userServiceImpl.findAllUsers();
	}
}
