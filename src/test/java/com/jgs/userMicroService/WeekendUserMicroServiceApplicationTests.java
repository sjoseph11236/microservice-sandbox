package com.jgs.userMicroService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jgs.userMicroService.service.UserServiceImpl;

@SpringBootTest
class WeekendUserMicroServiceApplicationTests {
	
	@Autowired
	UserServiceImpl userServiceImpl;

	@Test
	void contextLoads() {
		int actual = userServiceImpl.add(10, 5);
		int expected = 15; 
		Assertions.assertEquals(expected, actual);
	}
}
