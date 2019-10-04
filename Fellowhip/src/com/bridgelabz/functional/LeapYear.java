/******************************************************************************
 *  Compilation:  javac -d bin LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.functional.LeapYear 
 *  
 *  Purpose: Determines whether the given year is a leap year or not.
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.FunctionalUtility;

public class LeapYear {

	/*
	* The main function is written to take input from the user and
	* call leapYear function that determines if a year is a leap 
	* year or not
	*/
	public static void main(String[] args) {
			System.out.println("Enter year");
			
			//Reading input from the user
			int year=FunctionalUtility.userInt();
			
			//Method 1- using non-static function of FunctionalUtilty class
			
			boolean rs=FunctionalUtility.leapYear(year);
			if(rs)
				System.out.println(year + "  is a leap year");
			else
				System.out.println(year + "  is not a leap year");
		}


}
