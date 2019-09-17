/**
 * Purpose: Desc -> Reads in strings from standard input and prints them in sorted order.
 * Uses insertion sort.
 * I/P -> read in the list words
 * Logic -> Use Insertion Sort to sort the words in the String array
 * O/P -> Print the Sorted List
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 24-08-2019
 */

package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Insertion_word_7 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Length of list :");
		int NL= sc.nextInt();
		
		String list[] = new String[NL];
		
		System.out.print("Enter The Words For Insertion Sort :");
		
		for(int i=0;i<NL;i++)
			list[i] = sc.nextLine();
		
		int N = list.length;
	
		insertion(list,N);
	
		sc.close();
	
	}
	
	static void insertion(String list[],int N) {
		for(int i=0;i<N;i++) {
			String prev = list[i];
			int j=i-1;
			
			while(j>=0 && list[j].compareTo(prev) > 0) {
				list[j+1]= list[j];
				j=j-1;
			}
			list[j+1]=prev;
		}
		
		System.out.println("Sorted list is :");
		
		for(int i=0;i<N;i++) {
			
			System.out.print(list[i]+" ");
		}
	}
}
							