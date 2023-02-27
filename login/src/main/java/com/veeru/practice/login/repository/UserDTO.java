package com.veeru.practice.login.repository;

import java.beans.JavaBean;

@JavaBean
public class UserDTO {
	private String name;
	private String password;
	public UserDTO(String name,String password) {
		this.name=name;
		this.password=password;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	
}
