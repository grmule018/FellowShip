/**************************************************
 * Purpose = To find the Windchill
 * @author Ganesh Mule
 * @version 1.0
 * @since 01-08-2019 
 **************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class WindChill_16 {

	public static void main(String[] args) {
		System.out.println("Enter Temprature");
		double temp=Utility.integerInput();
		System.out.println("Enter wind speed");
		double wind_speed=Utility.integerInput();
		Utility.Windchill(temp,wind_speed);
		
}}