package com.jgs.userMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jgs.userMicroService.model.User;

//This The ORM that while interface with the database. methods that we will need to CRUD our database
// This turns our java in sql into code using methods inherited from Jpa interface. 
@Repository
public interface UserRepository extends JpaRepository <User, Long> {
	
}
