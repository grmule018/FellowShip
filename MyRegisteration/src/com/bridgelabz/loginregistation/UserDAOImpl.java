package com.bridgelabz.loginregistation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAOImpl implements UserDAO {
	
	static Connection con;
	static PreparedStatement ps;
	
	@Override
	public int InsertUser(User c) {
		int status=0;
		try {
			con=MyConnectionProvider.getCon();
			
			ps=con.prepareStatement("insert into User values(?,?,?,?,?)");
	
			ps.setString(1, c.getUsername());
			ps.setString(2, c.getFirstname());
			ps.setString(3, c.getLastname());
			ps.setString(4, c.getPhonenumber());	
			ps.setString(5, c.getPassword());
			
			status=ps.executeUpdate();
			
			System.out.println(status);
			
			con.close();
			
		}catch(Exception e){
			
			System.out.println(e);
		}
		return status;
	}

	@Override
	public User getUser(String username, String password) {
		
			User U =new User();
		
		try {
			con=MyConnectionProvider.getCon();
			
			ps=con.prepareStatement("select * from User where username=? and password=?");
			
			ps.setString(1, username);
			
			ps.setString(2, password);
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next())
			{
				U.setUsername(rs.getString(1));
				
				U.setFirstname(rs.getString(2));
				
				U.setLastname(rs.getString(3));
				
				U.setPhonenumber(rs.getString(4));
				
				U.setPassword(rs.getString(5));
				
			}
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return U;
	}


}
