/******************************************************************************
 *  Compilation:  javac -d bin DayOfWeek.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.DayOfWeek
 *  
 *  Purpose: Finds the day of the week for the given date.
 *
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 *  ***************************************************/

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;
import java.util.Scanner;

public class DayOfWeek {
	
	/*
	* The main function is written to take input from the user and and 
	* call the dayOfWeek function that returns the integer 
	* representation of the week
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//Reading inputs from the user
		System.out.println("Enter the date to find the day of the week");
		System.out.println("Enter the month");
		int month=s.nextInt();
		System.out.println("Enter the date");
		int date=s.nextInt();
		System.out.println("Enter the year");
		int year=s.nextInt();
		
		//Method 1- using static function of AlgorithmUtility class of

		int res=AlgorithmUtility.dayOfWeek(month,date,year);
		
		System.out.println("The integer representation for the days starts from Sunday being 0 and ending with Saturday being 6");
		System.out.println("The integer representation of the day is: "+res);
		
		s.close();
	}
}
