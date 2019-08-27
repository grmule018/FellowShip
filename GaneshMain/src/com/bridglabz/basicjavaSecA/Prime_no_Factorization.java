/*******************************************************************
 * Purpose
 * @author Ganesh Mule
 * @version 1.0
 * @since  09-08-2019
 *****************************************************************************/
package com.bridglabz.basicjavaSecA;

import com.bridglabz.utility.Utility;

public class Prime_no_Factorization {

	public static void main(String[] args) {
		long number;
		System.out.println("Enter the Number= ");
		number =Utility.longInput();
		Utility.Prime_no_Factorization(number);
	}
}
