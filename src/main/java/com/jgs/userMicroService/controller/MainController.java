package com.jgs.userMicroService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jgs.userMicroService.model.User;
import com.jgs.userMicroService.service.UserServiceImpl;

//Annotation for API
@RestController
public class MainController {
	
	UserServiceImpl userServiceImp = new UserServiceImpl();
//	GET Request for path of root
	@GetMapping("/")
	public User index() {
//		SHAPELESS DATA
//		Map <String, String> user = new HashMap<>();
//		user.put("name", "Sayeed");
//		user.put("email", "sayeed@email.com");
//		user.put("role", "admin");
//		Business Logic
		User user = userServiceImp.createUser();
		
				
		
		return user;
	}

}
