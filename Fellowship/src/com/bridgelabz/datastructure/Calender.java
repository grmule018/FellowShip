/******************************************************************************
 *  Compilation:  javac -d bin Calendar.java
 *  Execution:    java -cp bin com.bridgelabz.datastructure.Calendar n
 *  
 *  Purpose: �> Takes the month and year as command�line arguments and 
 *  			prints the Calendar of the month.
 * 
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 * ****************************************************************************/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;


public class Calender {
	
	/*
	* The main function is written to take input from the user
	* and print the calendar
	*/
	public static void main(String[] args) {
		 int month =Integer.parseInt(args[0]);
		 int year =Integer.parseInt(args[1]);
		 String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				 "October", "November", "December" };
		 int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		 
		 //Method 1- using function of FunctionalUtility class of
		
		 if (month == 2 && FunctionalUtility.leapYear(year))
			 days[month] = 29;
		 System.out.println("\t\t " + months[month] + " " + year);
		 System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		 
		//Method 2- using function of AlgorithmUtility class of
		
		 int d = AlgorithmUtility.dayOfWeek(month, 1, year);
		 
		 for (int i = 0; i < d; i++)
			 System.out.print("\t");
		 for (int i = 1; i <= days[month]; i++) {
			 System.out.print(i + "\t");
			 if (((i + d) % 7 == 0) || (i == days[month]))
				 System.out.println();
		 }
	}
}
