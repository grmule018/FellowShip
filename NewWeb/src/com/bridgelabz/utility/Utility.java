package com.bridgelabz.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Utility {
	
	static Statement stmt;
	static 	Connection con;
	static ResultSet rs;
			//loading d driver
	public static void Connection() throws SQLException
	{
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","password");//established connection
	}
	
	public static void StatementConnection() throws SQLException 
	{
		stmt=con.createStatement();//statement connection 
	}
	
	public static void QuerryExecution() throws SQLException 
	{   
		rs=stmt.executeQuery("select * from Emp");//Query execution
	
		while(rs.next())
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
	}
}