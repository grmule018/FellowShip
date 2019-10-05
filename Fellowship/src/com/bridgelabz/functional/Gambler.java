/******************************************************************************
 *  Compilation:  javac -d bin Gambler.java
 *  Execution:    java -cp bin com.bridgelabz.functional.Gambler 
 *  
 *  Purpose: Simulates a gambler who start with $stake and place fair $1 bets until 
 *  		he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
 *  		times he/she wins and the number of bets he/she makes and calculate win vs 
 *  		lose percentage.
 * 
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 * ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.FunctionalUtility;

public class Gambler {
	
	/*
	* The main function is written to take input from the user and
	* call gambler function that calculate win and lose percentage
	*/
	public static void main(String[] args) {
		
		//Reading input from the user
		System.out.println("Enter the stake");
		int stake=FunctionalUtility.userInt();
		System.out.println("Enter the goal");
		int goal=FunctionalUtility.userInt();
		System.out.println("Enter the number of times to gamble");
		int no_of_times=FunctionalUtility.userInt();
		
		//Method 1- using non-static function of FunctionalUtilty class
	
		FunctionalUtility.gambler(stake,goal,no_of_times);
		
		
	}

}
