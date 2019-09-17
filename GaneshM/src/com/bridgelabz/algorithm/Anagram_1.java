/**
 * purpose: An Anagram Detection Example
 * Desc -> One string is an anagram of another if the second is simply a rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
 * I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
 * O/P -> The Two Strings are Anagram or not....
 *
 * @author Ganesh Mule
 * @version 1.0
 * @since 24-08-2019
 **/

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Anagram_1 {

	public static void main(String[]args ) 
	{			
				System.out.println("Enter 1st String:");
				String String1=Utility.StringInput();
				
				System.out.println("Enter 2nd String:");
				String String2=Utility.StringInput();
				Utility.Anagram(String1,String2);					
								
		}
}
		
	
	