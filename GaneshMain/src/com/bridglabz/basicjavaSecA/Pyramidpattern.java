package com.bridglabz.basicjavaSecA;

import java.util.Scanner;

public class Pyramidpattern {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number; 
		int spaces;
		System.out.print("please enter number =");
		number=scanner.nextInt();
		spaces= number;
		scanner.close();
		
		for (int  i=0;i<number;i++)
		{	
			for(int  j=1;j<spaces;j++)
			{
				System.out.print(" ");
			}
			int n=0;
			for(int  k=0; k<=(i);k++)
			{
				System.out.print(n+" ");
			n++;
			}
			spaces--;
			System.out.println();
		}
	}
	
}
