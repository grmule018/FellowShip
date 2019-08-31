/**Bubble Sort 
 * Desc -> Reads in integers prints them in sorted order using Bubble Sort
 * I/P -> read in the list ints
 * O/P -> Print the Sorted List 
 *
 **/
package com.bridglabz.Algorithm;
import java.util.Scanner;

public class Bubble_sort_8 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Length of list :");
		int NL= sc.nextInt();
		
		int list[] = new int[NL];
		
		System.out.print("Enter The Elements For bubble Sort :");
		//user input
		for(int i=0;i<NL;i++)
			list[i] = sc.nextInt();
		
		int N = list.length;
	
		sc.close();
	
		//obtainig sorted list
		System.out.println("Sorted list is :");
			
			for(int i=0;i<N;i++) {
					
			System.out.print(list[i]+" ");
					
		}
		
		//sorting	of the element
		for(int i=0;i<N-1;i++) {
			
			for(int j=0;j<N-i-1;j++)
			{
				if(list[j]>list[j+1])
				{
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
		
	}
}
