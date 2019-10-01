package com.bidgelabz.employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
	
		public static void main(String args[])
		{
			try{
				Class.forName("com.mysql.jdbc.Driver");//loading d driver
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","password");//established connection
	//here Student is the database name, root is the username and password is the password
				Statement stmt=con.createStatement();//statement connection
				
				ResultSet rs=stmt.executeQuery("select * from Student");//Query execution

				while(rs.next())
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
				
//				int empId=rs.getInt(1);
//				String empName=rs.getString(2);
				
				con.close();
				}catch(Exception e)
					{ System.out.println(e);}
			
		}
	}
