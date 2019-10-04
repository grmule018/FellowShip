/******************************************************************************
 *  Compilation:  javac -d bin MergeSort.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.MergeSort
 *  
 *  Purpose: Sorts the array using the merge sort algorithm
 *
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class MergeSort {
	
	/*
	* The main function is written to take input from the user and
	* call mergeSort functions that sorts the given array.
	*/
	public static void main(String[] args) {
		
		System.out.println("Enter the number of data to be entered");
		
		//Reading input number of data to be entered into the array
		int num=AlgorithmUtility.userInt();		
		
		String[] array=new String[num];
		
		System.out.println("Enter the data");
		
		//Reading input data 
		for(int i=0;i<array.length;i++){
			 array[i]=AlgorithmUtility.userString();
		}
		
		int low=0;
		int high=array.length-1;
		
		//Method 2- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		AlgorithmUtility.mergeSort(array,low,high);
		
		//Method 2- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		AlgorithmUtility.print(array);
		
	}
}
