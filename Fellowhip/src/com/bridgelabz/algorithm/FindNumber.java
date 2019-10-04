/******************************************************************************
 *  Compilation:  javac -d bin FindNumber.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.FindNumber
 *  
 *  Purpose: Takes a command line argument N, asks you to think of a number
 *  		 between 0 and N1, where N = 2^n, and always guesses the answer with n
 *  		 questions.
 *
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class FindNumber {
	
	/*
	* The main function is written to take input from the user and
	* calls findNumber function to guess the answer with n questions
	*/
	public static void main(String[] args) {
		System.out.println("Enter number ");
		
		//Reading input number from the user
		int num=AlgorithmUtility.userInt();
	
		int limit=(int)Math.pow(2, num);
	
		System.out.println("Guess a number between 0 and "+limit);

		//Method 1- using static function of AlgorithmUtility class of
		
		int gnum=AlgorithmUtility.findNumber(0,limit);
		
		System.out.println("Your number is "+gnum);
	}
}
