/**************************************************
 * Purpose = To find the Windchill
 * @author Ganesh Mule
 * @version 1.0
 * @since 01-08-2019 
 **************************************************/
package com.bridglabz.basicjavaSecA;

import com.bridglabz.utility.Utility;

public class Windchill {

	public static void main(String[] args) {
		double temp=Double.parseDouble(args[0]);
		double wind_speed=Double.parseDouble(args[1]);
		Utility.Windchill(temp,wind_speed);
		
}}
