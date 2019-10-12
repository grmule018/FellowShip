package com.bridgelabz.loginregistration.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bridgelabz.loginregistration.model.User;

public class UserDAOImpl implements UserDAO {
	
	static Connection con;
	static PreparedStatement ps;
	
	@Override
	public int InsertUser(User u) {
		int status=0;
		try {
			con=MyConnectionProvider.getCon();
			
			ps=con.prepareStatement("insert into User values(?,?,?,?,?)");
	
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getFirstname());
			ps.setString(3, u.getLastname());
			ps.setString(4, u.getPhonenumber());	
			ps.setString(5, u.getPassword());
			
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
		
			User u =new User();
		
		try {
			con=MyConnectionProvider.getCon();
			
			ps=con.prepareStatement("select * from User where username=? and password=?");
			
			ps.setString(1, username);
			
			ps.setString(2, password);
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next())
			{
				u.setUsername(rs.getString(1));
				
				u.setFirstname(rs.getString(2));
				
				u.setLastname(rs.getString(3));
				
				u.setPhonenumber(rs.getString(4));
				
				u.setPassword(rs.getString(5));
				
			}
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return u;
	}


}
