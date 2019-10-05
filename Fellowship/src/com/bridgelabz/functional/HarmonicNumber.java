/******************************************************************************
 *  Compilation:  javac -d bin HarmonicNumber.java
 *  Execution:    java -cp bin com.bridgelabz.functional.HarmonicNumber 
 *  
 *  Purpose: Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
 * 
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 *  ***********************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class HarmonicNumber {
	
	/*
	* The main function is written to take input from the user and
	* call harmonicValue function that prints harmonic value
	*/
	public static void main(String[] args) {
		System.out.println("Enter the value for n");
		
		//Reading the input from the user
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();


		//Method 1- using non-static function of FunctionalUtilty class

		double res=FunctionalUtility.harmonicValue(n);
		
		System.out.println("The harmonic value is:" +res);
		s.close();
	}

}
