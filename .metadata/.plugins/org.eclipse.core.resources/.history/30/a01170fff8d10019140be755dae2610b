/**
 * Purpose: Question to find your number
 * Desc -> takes a command-line argument N, asks you to think of a number between 0 and N-1, where N = 2^n, and always guesses the answer with n questions.
 * I/P -> the Number N and then recursively ask true/false if the number is between a high and low value
 * Logic -> Use Binary Search to find the number
 * O/P -> Print the intermediary number and the final answer
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 24-08-2019
 **/
package com.bridglabz.algorithm;

import java.util.Scanner;

public class Quetion_5 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int A = Integer.parseInt(args[0]);
		
		int n= (int)Math.pow(2,A);
		
		System.out.println("Think the value between the 0 to "+(n-1)+"  :");
		System.out.println("");
		
		int result = search_number(0,n);
		
		System.out.print("Your value is "+result);
		sc.close();
		
	}
	static int search_number(int low,int high) {
		Scanner sc=new Scanner(System.in);
		
		if((high - low) == 1)
			return low;
		
		int mid = low + (high - low)/2;
		
		System.out.println("It is less than "+mid+" Then enter 1 otherwise 0 ");
		int check = sc.nextInt();
		
		
		if(check == 1)
			return search_number(low,mid);
		else
			return search_number(mid,high);
	}
}
