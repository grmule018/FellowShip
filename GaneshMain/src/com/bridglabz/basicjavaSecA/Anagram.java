package com.bridglabz.basicjavaSecA;

import com.bridglabz.utility.Utility;

public class Anagram {

	public static void main(String[]args ) 
	{			
				System.out.println("Enter 1st String:");
				String String1=Utility.StringInput();
				
				System.out.println("Enter 2nd String:");
				String String2=Utility.StringInput();
				Utility.Anagram(String1,String2);					
								
		}
}
		
	
	