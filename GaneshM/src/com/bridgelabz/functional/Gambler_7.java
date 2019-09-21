/***************************************************************************
 * 	Purpose: Write a Program GamlingSimulator.java where a gambler starts with certain stake
 *	in INR and places fair Re 1 bet until he/she goes broke or reaches the goal set as
 *	input. Keeps track of the number of times won and number of bets made. Run the
 *	simulation N times.
 *
 *	Input ­ stake, goal and trails are taken as input
 *	Output ­ Number of times won, Percent Win and Avg number of bets made.
 *
 *	@author Ganesh Mule
 *	@version 1.0
 *	@since  3-08-2019
 *
 ***************************************************************************/
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Gambler_7 {

private static void GamblerSimulator(int stake,int goal,int trails) {
	int bets=0;
	int wons=0;
	
	for (int t=0; t<trails;t++) 
	{
		int cash=stake;
		while(cash>0&&cash<goal) 
		{
			bets++;
			if(Math.random() < 0.5)cash++;
			else                   cash--;
		}if (cash==goal)wons++;
	}
	System.out.println( wons+" Number of Wons "+ trails   );
	System.out.println("percentage of wons "+100*wons/trails);
	System.out.println("percentage of loss "+1.0*bets/trails);
	  }
	public static void main(String[] args) {
		// take values from argument//
		System.out.println("Enter number of stake");
		int stake = Utility.integerInput();
		System.out.println("Enter number of goal");
		int goal = Utility.integerInput();
		System.out.println("Enter number of trails");
		int trails = Utility.integerInput();
		GamblerSimulator(stake,goal,trails);
		//Utility.GamblerSimulator( stake, goal, trails );
	}

}
