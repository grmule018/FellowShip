/******************************************************************************
 *  Compilation:  javac -d bin CouponNumber.java
 *  Execution:    java -cp bin com.bridgelabz.functional.CouponNumber 
 *  
 *  Purpose: Generates distinct coupon number and number of 
 *  		 random number required to get distinct coupon numbers
 *.
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.FunctionalUtility;

public class CouponNumber {

	/*
	* The main function is written to take input from the user and
	* calls couponNumber function that generates distinct coupon
	*  numbers
	*/
	public static void main(String[] args) {
		System.out.println("Enter the number of coupons to be generated");
		
		//Reading input number from the user
		int num=FunctionalUtility.userInt();
		
		//Method 1- using non-static function of FunctionalUtilty class
		
		int res=FunctionalUtility.couponNumber(num);
		
		System.out.println("Number of random numbers needed:"+ res);
		
	}
}
