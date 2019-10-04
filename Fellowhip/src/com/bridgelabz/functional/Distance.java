/******************************************************************************
 *  Compilation:  javac -d bin Distance.java
 *  Execution:    java -cp bin com.bridgelabz.functional.Distance 
 *  
 *  Purpose: Determines euclidean distance between two points.
 * 
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019  
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.FunctionalUtility;

public class Distance {

	/*
	* The main function is written to take input from the user and
	* call distance function that calculates the euclidean distance
	*/
	public static void main(String[] args) {
		//Reading inputs from the user
		System.out.println("Enter x");
		int x=FunctionalUtility.userInt();
		System.out.println("Enter y");
		int y=FunctionalUtility.userInt();
		
		//Method 1- using non-static function of FunctionalUtilty class
		
		double dist=FunctionalUtility.distance(x,y);
		
		System.out.println("The distance is "+dist);
		
		System.out.println(dist);
	}

}
