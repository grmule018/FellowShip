package com.bridglabz.basicjavaSecA;

import com.bridglabz.utility.Utility;

/**
 *  
 * This Java program is all about how to checks whether the given input strings are anagrams or not
 */
public class AnagramTest {

	public static void main(String[] args) {
		//Check Anagram Using Sorting logic
		
		
		isAnagramsBySortingLogic("restful", "fluster");
		
		
		
		
	}
	
	public static void isAnagramsBySortingLogic(String inputText1, String inputText2) {
		//convert String to lower case and remove spaces
		String s1 = Utility.convertInputInLowerCaseAndRemoveSpaces(inputText1);
		String s2 = Utility.convertInputInLowerCaseAndRemoveSpaces(inputText2);

		boolean flag = true;
		// Here we are checking String length if both strings have different length then it is not anagrams
		if (s1.length() != s2.length()) {
			flag = false;
		}
		//If we find both Strings have same length then sort both the strings
		s1 = Utility.sortInputString(s1);
		s2 = Utility.sortInputString(s2);

		flag = s1.equals(s2);
		isStringAnagram(inputText1, inputText2, flag);
	}
	
	
	
	private static void isStringAnagram(String inputText1, String inputText2, boolean flag) {
		if (flag) {
			System.out.println(inputText1 + " and " + inputText2 + " are anagrams");
		} else {
			System.out.println(inputText1 + " and " + inputText2 + " are not anagrams");
		}
	}
}
		
	
	