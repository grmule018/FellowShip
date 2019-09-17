/**
 * Purpose : To find prime no is Palindrome or not
 */
package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Prime_Palindrome_3 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the number of Range :");
			int N = sc.nextInt();
			
			int[] prime =new int[N];
				
			int p=0;
				
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
					prime[p] = i;
					p++;
				}
			}
							
			System.out.println("The prime number are :");
			for(int x=0;x<p;x++)
			System.out.print(prime[x]+" ");
			System.out.println("");
			System.out.println("The palindrome number are :");
			for(int x=0;x<p;x++)
			{
				int a = prime[x];
				int temp = a, pal=0, r;
					
				while(a>0) {
					r=a%10;
					
					pal = (pal*10) + r;
						
					a=a/10;
					}
				if(temp == pal)
					System.out.println("The "+pal+" number is palidrome");
		}
				sc.close();
	}
}