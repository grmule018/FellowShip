/**
 * Find Prime numbers in given range
 *
 **/

package com.bridglabz.algorithm;

import java.util.Scanner;

public class Prime_no_Range_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the range of prime  number :");
		int N = sc.nextInt();
		
		int[] prime =new int[N];
		
		int l=0;
		
		for(int i=1;i<=N;i++)
		{
			int count = 0;
			for(int k=i;k>=1;k--) 
			{
				if(i%k== 0)
				{
					count++;
					
				}
			}
			if(count == 2)
			{
				prime[l] = i;
				l++;
			}
		}
		
		for(int x=0;x<l;x++)
			System.out.print(prime[x]+" ");
		
		sc.close();
	}
}