/******************************************************************************
 *  Compilation:  javac -d bin FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.functional.FlipCoin 
 *  
 *  Purpose: Flip Coin and print percentage of Heads and Tails
 * 
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 *******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.FunctionalUtility;

public class FlipCoin {
	
	/*
	* The main function is written to take input from the user and
	* calls perHeadTail function that calculate head vs tail percenatage 
	* after flipping a coin n number of times
	*/
	public static void main(String[] args) {
		System.out.println("Enter the number of times the coin is being flipped");
		
		int num=FunctionalUtility.userInt();
		
		//Method 1- using non-static function of FunctionalUtilty class
		
		FunctionalUtility.perHeadTail(num);
		
	}

}
