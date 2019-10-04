package com.bridgelabz.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;


public class StudentManager implements Student {

	public Scanner sc=new Scanner(System.in);
	
	public static Connection con;
	
	public static PreparedStatement stmt;
	
	public static PreparedStatement ps;
	
	public static PreparedStatement updts;
	

	public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static {
		try {
		
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "password");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			
			ps = con.prepareStatement("insert into Student values(?,?,?,?)");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			
			stmt=con.prepareStatement("delete from  Student where ID= ?");
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
		
			updts=con.prepareStatement("update Student set Name=?, Age=?, Address=? where ID=?");

		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void showtable() throws IOException, SQLException 
	{	
		ResultSet rs = ps.executeQuery("select * from Student");

		while (rs.next() ) 
		{
		
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
		
		}
		return ;
	} 
	
public void addStudent() throws IOException, SQLException {
		System.out.println("Enter Student ID:");
		int id = Integer.parseInt(br.readLine());
			System.out.println("Enter name:");
		String name = br.readLine();
			System.out.println("Enter age:");
		int age = Integer.parseInt(br.readLine());
			System.out.println("Enter Address");
		String address = br.readLine();
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.setString(4, address);
		
		int i = ps.executeUpdate();
		
		System.out.println(i + " records affected");
}
	
public void updateInformation() throws IOException, SQLException 
{
	System.out.println("Enter update info.");
	System.out.println("Enter name:");
	String name = br.readLine();
	System.out.println("Enter age:");
	int age = Integer.parseInt(br.readLine());
	System.out.println("Enter Address");
	String address = br.readLine();
	System.out.println("Enter ID where want to update");
	int id = Integer.parseInt(br.readLine());
		
		updts.setString(1, name);
		updts.setInt(2, age);
		updts.setString(3, address);
		updts.setInt(4, id);
		int j = updts.executeUpdate();
		System.out.println(j + " records affected");
	}

public void removeStudent() throws IOException, SQLException {
		
	System.out.println("Delete by ID");
			
	System.out.println("Enter ID");
		int Id=sc.nextInt();
		stmt.setInt(1,Id);
		
		int i=stmt.executeUpdate();

	System.out.println(i + " records affected");
}
}
