/******************************************************************************
 *  Compilation:  javac -d bin PrimeFactors.java
 *  Execution:    java -cp bin com.bridgelabz.functional.PrimeFactors 
 *  
 *  Purpose: Computes the prime factorization of N using brute force
 * 
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.FunctionalUtility;

public class PrimeFactors {
	

	/*
	* The main function is written to take input from the user and
	* call primeFactor function that computes the prime factors.
	*/
	public static void main(String[] args) {
		System.out.println("Enter the number N");
	
		int num=FunctionalUtility.userInt();
		
		//Method 1- using non-static function of FunctionalUtilty class
		
		FunctionalUtility.primeFactor(num);
	}
}
