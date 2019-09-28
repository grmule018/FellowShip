/**************************************************
 * Purpose = To find the LeapYear 
 * @author Ganesh Mule
 * @version 1.0
 * @since 01-08-2019 
 **************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear_3 {
	
	
private static void Leapyear(int Year){
	boolean flag = false;
	if (Year%100 ==0) 
	{
		flag = false;
	}
	else if(Year%400==0|| Year%4==0) 
	{
		flag=true;
	}
	else {
		flag=false;
	}
	if (flag) {
		System.out.println("Given year "+Year+" leap year");
	}else {
		System.out.println("given year is not leap year");
	}
}
		
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any year:");
		int Year= scanner.nextInt();
		Leapyear(Year);
	//	Utility.LeapYear(Year);
		scanner.close();
	    }
				
}
