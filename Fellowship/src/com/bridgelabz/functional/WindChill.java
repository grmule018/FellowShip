/******************************************************************************
 *  Compilation:  javac -d bin WindChill.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.WindChill 
 *  
 *  Purpose: Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour),
 *  		 to calculate effective temperature (the wind chill)
 * 
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.FunctionalUtility;

public class WindChill {
	
	/*
	* The main function is written to take input from the user and
	* call WindChill function that calculates the effective temperature
	*/
	public static void main(String[] args) {
		//Reading the inputs from the user
		System.out.println("Enter the temperature in Farenheit");
		double temp=FunctionalUtility.userDouble();
		System.out.println("Enter the speed of the wind");
		double wind_speed=FunctionalUtility.userDouble();
		
		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		double res=FunctionalUtility.windChill(temp, wind_speed);
		
		System.out.println("The efficient temperature:"+ res);
	}
}
