/******************************************************************************
 *  Compilation:  javac -d bin SumZero.java
 *  Execution:    java -cp bin com.bridgelabz.functional.SumZero 
 *  
 *  Purpose: A program with cubic running time. Read in N integers and counts the
 *			 number of triples that sum to exactly 0.
 * 
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 ******************************************************************************/

package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
public class SumZero {

	/*
	* The main function is written to take input from the user and
	* call sumZero function that counts the 
	* number of triples that sum to exactly 0.
	*/
	public static void main(String[] args) {
		System.out.println("Enter the number of integers");
		
		//Reading the input from the user
		int num=FunctionalUtility.userInt();
		
		//Method 1- using non-static function of FunctionalUtilty class
		
		FunctionalUtility.sumZero(num);

	}

}
