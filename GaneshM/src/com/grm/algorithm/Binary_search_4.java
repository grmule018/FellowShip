/**
 * purpose: Binary search for Integers.
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 24-08-2019
 **/
package com.grm.algorithm;

import java.util.Scanner;

public class Binary_search_4 {
	public static void main(String[] args) {
		int list[] = {0,5,4,6,8,7,1,9,2,3};
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the search value :");
		int N = sc.nextInt();
		
		int start = 0;
		int end = list.length;
		
		int result = binarySearch(list,start,end-1,N);
		
		if(result == -1) {
			System.out.print("Elelment not found");
		}else {
			System.out.print("Element find at "+result);
		}
		sc.close();
	}

	static int binarySearch(int list[],int start,int end,int N) {
	
		if(end >= start) {
			int mid = start + (end-start)/2;
			
			if(list[mid] == N)
				return mid;
			else if(list[mid]>N)
				return binarySearch(list,start,end-1,N);
			else
				return binarySearch(list,start,end+1,N);
		}else
			return -1;
	
	
	}
}
