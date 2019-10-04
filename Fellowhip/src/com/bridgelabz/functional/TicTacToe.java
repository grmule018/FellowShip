/******************************************************************************
 *  Compilation:  javac -d bin TicTacToe.java
 *  Execution:    java -cp bin com.bridgelabz.functional.TicTacToe
 *  
 *  Purpose: Program to play a Cross Game or Tic�Tac�Toe Game. Player 1 is
 *  		 the Computer and the Player 2 is the user.
 * 
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.FunctionalUtility;

public class TicTacToe {
	public static void main(String[] args) {
		
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.utility package
		FunctionalUtility.play();
	}
}
