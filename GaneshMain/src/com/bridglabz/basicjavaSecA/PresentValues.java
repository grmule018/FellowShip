/*************************************************
 * Purpose to find present values
 *****************************************************/
package com.bridglabz.basicjavaSecA;

import com.bridglabz.utility.Utility;

public class PresentValues {

	public static void main(String[] args) {
		double InvestC = Double.parseDouble(args[0]);
		double year = Double.parseDouble(args[1]);
		double rate = Double.parseDouble(args[2]);
		Utility.PresentValues(InvestC,year,rate);
	}

}
