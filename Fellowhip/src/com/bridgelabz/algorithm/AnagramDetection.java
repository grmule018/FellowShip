/******************************************************************************
 *  Compilation:  javac -d bin AnagramDetection.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.AnagramDetection n
 *  
 *  Purpose: Determines whether two strings are anagram.
 *
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class AnagramDetection {
	
/*
* The main function is written to take input from the user and and 
* call the isAnagram function that checks anagram of two strings
*/
    
	public static void main(String[] args) {
		System.out.println("Enter a string");
		
		//Reading input two input strings from user
		String str1=AlgorithmUtility.userString();
		System.out.println("Enter another string to detect anagram");
		String str2=AlgorithmUtility.userString();
		
		//Method 1- using static function of AlgorithmUtility class of
	
		boolean rs=AlgorithmUtility.isAnagram(str1,str2);
		if(rs) {
			System.out.println("The strings are anagram");
		}
		else
			System.out.println("The strings are not anagram");
	}
}
