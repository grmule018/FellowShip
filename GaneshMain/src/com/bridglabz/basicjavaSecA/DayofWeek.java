/**********************************************************************************
 * Purpose = To find  the day for given date
 * @author Ganesh Mule
 * @version 1.0
 * @since 01-08-2019
 *********************************************************************************/
package com.bridglabz.basicjavaSecA;

import com.bridglabz.utility.Utility;

public class DayofWeek {
	public static void main(String[]args) {
		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		Utility.DayofWeek(d,m,y);
		//String[] dayofweek = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" }; //
		
	}

}
