/**
 * Find the Fewest Notes to be returned for Vending Machine
 * Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by Vending Machine. Write a Program to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
 * I/P -> read the Change in Rs to be returned by the Vending Machine
 * Logic -> Use Recursion and check for largest value of the Note to return change to get to minimum number of Notes. 
 * O/P -> Two Outputs - one the number of minimum Note needed to give the change and second list of Rs Notes that would given in the Change

 */
package com.bridglabz.algorithm;
import com.bridglabz.utility.Utility;
import java.util.Scanner;

public class Vendor_machine_10 {
	public static void main(String[] args) {
		int note[] = {1000,500,200,100,50,10,5,2,1};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Change to be return :");
		int change = sc.nextInt();
		
		Utility.Vender_machine_10(change,note);		
		sc.close();
	}
}
