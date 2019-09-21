/**
 * Purpose: Sum of three Integer adds to ZERO
 * Desc -> A program with cubic running time. Read in N integers and counts the   number of triples that sum to exactly 0.
 * I/P -> N number of integer, and N integer input array
 * Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
 * O/P -> One Output is number of distinct triplets as well as the second output is to print the distinct triplets.
 **/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Triplets_10 {
	public static void main(String[] args)
	{
		
		int arr[] = new int[10];
		
		System.out.print("Enter the length of value  N =");
		int N= Utility.integerInput();
		
		System.out.print("Enter The integers :");
		for(int i=0; i< N;i++)
		{
			arr[i]=Utility.integerInput();
		}
		
		for(int i=0;i<N-2; i++)
			for(int j=0;j<N-1;j++)
				for(int k=0;k<N;k++)
				{
					if(arr[i] + arr[j] +arr[k] ==0) 
					{
						System.out.println("Triplets:");
						System.out.println(+arr[i]+" "+ arr[j]+" "+arr[k]);
					}
				}
	}
}
