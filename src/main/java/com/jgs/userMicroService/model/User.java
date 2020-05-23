package com.jgs.userMicroService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
//	Specifying it is primary key
	@Id 
//	This id will be automatically generate an id.
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long  id; 
	private String name; 
	private String email; 
	private String role;
//	constructor overloading. required by jpa
	public User() {}
	
	public User(String name, String email, String role) {
		super();
		this.name = name;
		this.email = email;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getId() {
		return id;
	}
}
