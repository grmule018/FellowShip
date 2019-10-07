package com.bridgelabz.loginregistation;

public interface CustomerDAO {

	public int InsertCustomer(Customer c);
	public Customer getCustomer(String username,String password);
		
}
