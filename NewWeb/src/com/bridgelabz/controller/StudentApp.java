package com.bridgelabz.controller;

import java.util.Scanner;

import com.bridgelabz.service.StudentManager;

public class StudentApp
{  

	public static void main(String args[])throws Exception{  
	
	Scanner sc =new Scanner (System.in);
	StudentManager sm= new StudentManager();
	String ch;
	
	do{
		System.out.println("1.Show table\n2.Add new Student\n3.Remove Student\n4.Update Information\n5.Quit");
		
		System.out.println("Enter your choice");
	
		int choice = sc.nextInt();
		switch (choice) { 
		case 1:
				sm.showtable();
				break;
		
		case 2:
				sm.addStudent();
			    break;
		case 3:
				sm.removeStudent();
				break;
		case 4:
				sm.updateInformation();
				break;
	
		case 5:
				System.out.println("Quit");
				break;
		
		}
		System.out.println("Do you want to continue: y/n");
		ch= sc.next();
	}while(ch.equalsIgnoreCase("Y"));  
	sc.close();
}
}
