package com.bridgelabz.loginregistation;

import java.sql.Connection;


public interface MyProvider {
	String username="root";
	String password="password";
	String url= "jdbc:mysql://localhost:3306/Customer";
	static Connection con=null;
}

