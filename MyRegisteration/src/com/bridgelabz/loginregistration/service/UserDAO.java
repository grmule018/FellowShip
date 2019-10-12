package com.bridgelabz.loginregistration.service;

import com.bridgelabz.loginregistration.model.User;

public interface UserDAO {

	public int InsertUser(User U);
	public User getUser(String username,String password);
		
}
