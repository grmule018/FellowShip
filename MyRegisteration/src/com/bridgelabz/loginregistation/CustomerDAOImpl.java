package com.bridgelabz.loginregistation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDAOImpl implements CustomerDAO {
	
	static Connection con;
	static PreparedStatement ps;
	
	@Override
	public int InsertCustomer(Customer c) {
		int status=0;
		try {
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("insert into Customer values(?,?,?,?,?)");
			ps.setString(1, c.getUsername());
			ps.setString(2, c.getFirstname());
			ps.setString(3, c.getLastname());
			ps.setString(4, c.getPhonenumber());
			ps.setString(5, c.getPassword());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return status;
	}

	@Override
	public Customer getCustomer(String username, String password) {
		Customer c =new Customer();
		try {
			con=MyConnectionProvider.getCon();
			
			ps=con.prepareStatement("select* from Customer where username=? password=?");
			
			ps.setString(1, username);
			
			ps.setString(5, password);
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next())
			{
				//c.setUsername(rs.getString(1));
				
				c.setFirstname(rs.getString(2));
				
				c.setLastname(rs.getString(3));
				
				c.setPhonenumber(rs.getString(4));
				
			}
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return c;
	}

}
