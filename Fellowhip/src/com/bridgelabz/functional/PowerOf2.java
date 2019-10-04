/******************************************************************************
 *  Compilation:  javac -d bin PowerOf2.java
 *  Execution:    java -cp bin com.bridgelabz.functional.PowerOf2 
 *  
 *  Purpose: This program takes a command­line argument N and prints a table of the
 *  		 powers of 2 that are less than or equal to 2^N.
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.FunctionalUtility;

public class PowerOf2 {

	/*
	* The main function is written to take input from the user and
	* call powerOf2 function that prints the table of the powers of 2
	*/
	public static void main(String[] args) {
		System.out.println("Enter the value for n");
		
		//Reading the input from the user
		int n=FunctionalUtility.userInt();
		
		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		FunctionalUtility.powerOf2(n);
	}

}
