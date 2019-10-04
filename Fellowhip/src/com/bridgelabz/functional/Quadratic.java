/******************************************************************************
 *  Compilation:  javac -d bin Quadratic.java
 *  Execution:    java -cp bin com.bridgelabz.functional.Quadratic 
 *  
 *  Purpose: To find the roots of the equation a*x*x + b*x + c.
 *  
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 *  ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.FunctionalUtility;

public class Quadratic {

	/*
	* The main function is written to take input from the user and
	* call quadratic function that find roots of the equation.
	*/
	public static void main(String[] args) {
		//Reading the inputs from the user
		System.out.println("Equation of the form: a*x*x+b*x+c");
		System.out.println("Enter the value for a");
		int a=FunctionalUtility.userInt();
		System.out.println("Enter the value for b");
		int b=FunctionalUtility.userInt();
		System.out.println("Enter the value for c");
		int c=FunctionalUtility.userInt();
		
		//Method 1- using non-static function of FunctionalUtilty class

		FunctionalUtility.quadratic(a,b,c);
	}

}
