/*********************************************************
 *	Purpose = that takes two integer command­line arguments x
 *	and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
 *	formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
 * @author  Ganesh Mule
 * @version 1.0
 * @since   31-07-2019
 ********************************************************************/
package com.grm.functional;

import com.grm.utility.Utility;

public class Distance_11 {
	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		Utility.Distance(x,y);

}}
