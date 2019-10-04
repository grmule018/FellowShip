/******************************************************************************
 *  Compilation:  javac -d bin ToBinary.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.ToBinary 
 *  
 *  Purpose: Converts the given decimal number to binary number.
 *
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class ToBinary {

	/*
	* The main function is written to take input from the user and
	* call the toBinary function that converts decimal to binary
	*/
	public static void main(String[] args) {
		System.out.println("Enter the decimal number to be converted");
		
		//Reading the input from the user
		int num=AlgorithmUtility.userInt();
		
		//Method 1- using static function of AlgorithmUtility class of
		
		AlgorithmUtility.IntegerToBinary(num);
	}
		
}
