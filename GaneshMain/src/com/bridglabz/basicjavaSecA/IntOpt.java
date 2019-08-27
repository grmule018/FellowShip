/******************************************************************************
 *  Purpose: To do integer operation by taking a, b and c as input values and print the
 *  following integer operations
 *	a + b *c, a * b + c, c + a / b, and a % b + c.
 *  @author  Ganesh Mule
 * 	@version 1.0
 *  @since   31-07-2019
 *******************************************************************************/
package com.bridglabz.basicjavaSecA;

import com.bridglabz.utility.Utility;

public class IntOpt {	
	
	public static void main(String[] args) {
	int a,b,c;
		System.out.println( "Enter value for a:"); 
		a= Utility.integerInput();
		System.out.println( "Enter value for b:");
		b= Utility.integerInput();
		System.out.println( "Enter value for c:");
		c= Utility.integerInput();
		Utility.IntOpt(a,b,c);
	
	}
}
