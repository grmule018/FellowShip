/*********************************************************************************************
 * Purpose = To do Double operation by taking a, b and c as input values and print the
    following double operations
 *	a + b *c, a * b + c, c + a / b, and a % b + c. 
 * @author Ganesh Mule
 * @version 1.0
 * @since 01-08-2019 
 **********************************************************************************************/
package com.bridglabz.basicjavaSecA;

import java.util.Scanner;

import com.bridglabz.utility.Utility;

public class DoubleOpt {
	public static void main(String[]args)
	{
		Double a,b,c;
		Scanner value = new Scanner(System.in);
		System.out.print("Enter a Value a=");
		a= value. nextDouble();
		System.out.print("Enter a Value b=");
		b= value.nextDouble();
		System.out.print("Enter a value C=");
		c= value.nextDouble();
		value.close();
		Utility.Double(a,b,c);
		}
	
}
