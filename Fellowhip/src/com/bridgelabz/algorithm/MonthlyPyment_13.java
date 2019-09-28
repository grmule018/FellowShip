/**************************************************************************
 * Purpose: To find monthly payment & interest rate
 * using the formula
 * 				  principal * rate
 *     payment =  -------------------      where n = 12 * years,
 *                1  - (1 + r)^(-n)              r = (rate / 100) / 12
 *@author Ganesh Mule
 *@version 1.0
 *@since  02-08-2019
 ******************************************************************************/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class MonthlyPyment_13 {
	public static void main(String[]args) {
		System.out.println("Enter principal amount");
	double principal = Utility.doubleInput();
		System.out.println("Enter year");
	double year = Utility.doubleInput();
		System.out.println("Enter rate"); 
	double rate = Utility.doubleInput();
	Utility.MonthlyPyment_13(principal,year,rate);
		
	}
}
