package com.bridgelabz.loginregistration;

public interface UserDAO {

	public int InsertUser(User U);
	public User getUser(String username,String password);
		
}
