/**************************************************
 * Purpose = To find the LeapYear 
 * @author Ganesh Mule
 * @version 1.0
 * @since 01-08-2019 
 **************************************************/
package com.bridglabz.basicjavaSecA;

import java.util.Scanner;

import com.bridglabz.utility.Utility;

public class LeapYear {
	public static void main(String args[]) {
		int Year;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any year:");
		Year= scanner.nextInt();
		Utility.LeapYear(Year);
		scanner.close();
	    }
				
}
