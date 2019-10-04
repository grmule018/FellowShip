/******************************************************************************
 *  Compilation:  javac -d bin TwoDArray.java
 *  Execution:    java -cp bin com.bridgelabz.functional.TwoDArray 
 *  
 *  Purpose: A library for reading in 2D arrays of integers, doubles, or booleans from
 *  		 standard input and printing them out to standard output.
 *  
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 *  ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class TwoDArray {
	
	/*
	* The main function is written to take input from the user and
	* call displayArray function that displays array of any type
	*/
	public static void main(String[] args) {
		FunctionalUtility<Object> fu=new FunctionalUtility<Object>();
		
		//Reading the input from the user
		System.out.println("Enter the number of rows: m");
		int m=FunctionalUtility.userInt();
		System.out.println("Enter the number of columns: n");
		int n=FunctionalUtility.userInt();
		System.out.println("1:Integer  2:Double  3:Boolean");
		
		//Reading the choice of the user
		int choice=FunctionalUtility.userInt();
		
		switch(choice){
			case 1: Integer[][] array=new Integer[m][n];
					for(int i=0;i<m;i++){
						for(int j=0;j<n;j++){
							array[i][j]=AlgorithmUtility.userInt();
						}
					}

					//Method 1- using non-static function of FunctionalUtilty class

					fu.displayArray(array);
					
					break;
					
			case 2: Double[][] darray=new Double[m][n];
					for(int i=0;i<m;i++){
						for(int j=0;j<n;j++){
							darray[i][j]=FunctionalUtility.userDouble();
						}
					}
					

					//Method 2- using non-static function of FunctionalUtilty class

					fu.displayArray(darray);
					
					break;
					
			case 3: Boolean[][] barray=new Boolean[m][n];
					for(int i=0;i<m;i++){
						for(int j=0;j<n;j++){
							barray[i][j]=FunctionalUtility.userBoolean();
						}
					}
					

					//Method 3- using non-static function of FunctionalUtilty class

					fu.displayArray(barray);
					
					break;
					
			default: System.out.println("Select among the choices"); 
					 break;
		}
	}

}
