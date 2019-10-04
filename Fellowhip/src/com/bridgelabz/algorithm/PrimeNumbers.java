/******************************************************************************
 *  Compilation:  javac -d bin PrimeNumbers.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.PrimeNumbers 
 *  
 *  Purpose: Finds the prime numbers in the given range
 *
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.AlgorithmUtility;

public class PrimeNumbers {
	
	/*
	* The main function is written to take input from the user and
	* call the primeNumber() function that finds prime numbers
	*/
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		int start=0;
		int end=1000;
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		list=AlgorithmUtility.primeNumbers(start,end);
		
		for(int i:list)
			System.out.println(i);
		}
		
}
