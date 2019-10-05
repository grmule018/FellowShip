/******************************************************************************
 *  Compilation:  javac -d bin BinarySearchFile.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.BinarySearchFile
 *  
 *  Purpose: Read in a list of words from File. Then prompt the user to enter a word to
 *  		 search the list. The program reports if the search word is found in the list.
 *
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 ******************************************************************************/

package com.bridgelabz.algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.utility.AlgorithmUtility;

public class BinarySearchFile {
	
	/*
	* The main function is written to take input from the user and
	* calls binarySeacrhFile function to search word from list
	*/
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("/home/user/Downloads/RELEASE/Fellowhip/src/com/bridgelabz/algorithm/file.csv");
		BufferedReader br=new BufferedReader(fr);
		String str="";
		String delimitor=",";
		String[] array=new String[100];
		while((str=br.readLine())!=null){
			array=str.split(delimitor);
		}
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		AlgorithmUtility.bubbleSort(array, array.length);
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("Enter the word to be searched from the file list");
		String word=AlgorithmUtility.userString();
		
		//Method 2- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		int i=AlgorithmUtility.binarySearchGeneric(array, word);
		
		if(i>=0)
			System.out.println("Word is found in the list at the index "+i);
		else
			System.out.println("Word is not found in the list");
		
		br.close();
	}
}
