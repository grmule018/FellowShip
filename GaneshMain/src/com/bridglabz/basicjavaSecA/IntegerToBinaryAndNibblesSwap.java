/********************************************************************
 * Purpose : Integer To Binary And Nibble Swap
 * @author Ganesh Mule
 * @version 1.0
 * @since 5-08-2019
 ********************************************************************/
package com.bridglabz.basicjavaSecA;

import com.bridglabz.utility.Utility;

public class IntegerToBinaryAndNibblesSwap{
	
 public static void main(String args[]) {
	int x = Integer.parseInt(args[0]);
	int result=Utility.IntegerToBinaryAndNibbleSwap(x);
	System.out.println(result);	
}}