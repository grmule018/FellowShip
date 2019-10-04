/******************************************************************************
 *  Compilation:  javac -d bin SquareRoot.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.SquareRoot 
 *  
 *  Purpose: Finds the square root of the given number using Newton's Method
 *
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class SquareRoot {
	
	/*
	* The main function is written to take input from the user and
	* call the squareRoot() function that finds square root of a number
	*/
	public static void main(String[] args) {
		
		//Reading input from the user
		System.out.println("Enter the number to find sqaure root of");
		double num=AlgorithmUtility.userDouble();
		
		//Method 1- using static function of AlgorithmUtility class of
	
		double res=AlgorithmUtility.squareRoot(num);
		
		System.out.println("The square root of the given number using Newton's Method is: "+ res);
	}
	
}
