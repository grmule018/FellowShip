/*************************************************************
 * Purpose = To find the given date is come or not in the Spring Season 
 * @author Ganesh Mule
 * @version 1.0
 * @since 01-08-2019 
 *************************************************************/
package com.bridglabz.basicjavaSecA;
import com.bridglabz.utility.Utility;

public class SpringSeason {
	public static void main (String[] args){
		int M = Integer.parseInt(args[0]);
		int D = Integer.parseInt(args[1]);
		Utility.SpringSeason(M,D);

	}	
}
