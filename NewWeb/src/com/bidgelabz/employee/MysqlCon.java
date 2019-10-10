package com.bidgelabz.employee;

import java.sql.*;

public class MysqlCon{
	public static void main(String args[])
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");//loading d driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","password");//established connection
			//here Employee is the database name, root is the username and password is the password
			Statement stmt=con.createStatement();//statement connection
			
			ResultSet rs=stmt.executeQuery("select * from Emp");//Query execution

			while(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			
//			int empId=rs.getInt(1);
//			String empName=rs.getString(2);
			
			con.close();
			}catch(Exception e)
				{ System.out.println(e);}
		
	}
}