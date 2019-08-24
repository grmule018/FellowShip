/**
 * purpose: Binary Search the Word from Word List
 *
 * @author Ganesh Mule
 * @version 1.0
 * @since 24-08-2019
 **/
package com.bridglabz.Algorithm;
import java.util.Scanner;

public class binary_word_4 {
	public static void main(String[] args) {
		String list[] = {"aaa","bbb","ccc","ddd","eee","fff"};
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the search word :");
		String str = sc.nextLine();
		
		int start = 0;
		int end = list.length;
		
		int result = binarySearch(list,start,end-1,str);
		
		int result1= result-1;
		
		if(result == -1) {
			System.out.print("Element not found");
		}else {
			System.out.print("Element "+list[result1]+" is find at "+result1);
		}
		sc.close();
	}

	static int binarySearch(String list[],int start,int end,String N) {
	
		if(end >= start) {
			int mid = start + (end-start)/2;

			if(list[mid].compareTo(N) == 1)
				return mid;
			else if(list[mid].compareTo(N)>0)
				return binarySearch(list,start,end-1,N);
			else
				return binarySearch(list,start,end+1,N);
		}else
			return -1;
	
	
	}
}
