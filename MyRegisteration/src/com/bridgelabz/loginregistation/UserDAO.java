package com.bridgelabz.loginregistation;

public interface UserDAO {

	public int InsertUser(User U);
	public User getUser(String username,String password);
		
}
