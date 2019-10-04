/******************************************************************************
 *  Compilation:  javac -d bin VendingMachine.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.VendingMachine
 *  
 *  Purpose: To find the fewest notes to be returned to the vending machine
 *
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 ******************************************************************************/

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class VendingMachine {

	/*
	* The main function is written to take input from the user and
	* call the vendingMachine function that finds the fewest notes 
	* to be returned to the vending machine
	*/
	public static void main(String[] args) {
		int[] notes={2000,500,100,50,20,10,5,2,1};
		System.out.println("Enter the amount");
		
		//Reading the input from the user
		int amt=AlgorithmUtility.userInt();
		
		//Method 1- using static function of AlgorithmUtility class of
	
		int min_notes=AlgorithmUtility.vendingMachine(notes,amt);
		
		System.out.println("The minimum notes required is:"+min_notes);
		
	}
}
