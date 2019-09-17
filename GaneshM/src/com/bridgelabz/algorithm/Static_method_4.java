/**
 * To the Utility Class write the following static methods
 * Desc -> Create Utility Class having following static methods
 * binarySearch method for integer
 * binarySearch method for String
 * insertionSort method for integer
 * insertionSort method for String
 * bubbleSort method for integer
 * bubbleSort method for String
 * I/P -> Write main function to call the utility function
 */
package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Static_method_4 {
	public static void main(String[] args) {
		
	//For binary integer search 
	int list[] = {0,1,2,3,4,5,6,7,8,9,10};
	
	Scanner sc = new Scanner(System.in);
			
	System.out.println("Binary Integer Enter the search value :");
	int N = sc.nextInt();
	
	int start = 0;
	int end = list.length;
	
	int result = com.bridgelabz.utility.Utility_3.binarySearch_i(list,start,end-1,N);
	
	if(result == -1) {
		System.out.println("Elelment not found");
	}else {
		System.out.println("Element find at "+result);
	}
	
	// for binary word search

	String list1[] = {"aaa","bbb","ccc","ddd","eee","fff"};
	
	System.out.println("Binary Word Enter the search word :");
	String N1 = sc.next();
	
	int start1 = 0;
	int end1 = list1.length;
	
	int result1 = com.bridgelabz.utility.Utility_3.binarySearch_w(list1,start1,end1-1,N1);
	
	int result2= result1-1;
	
	if(result1 == -1) {
		System.out.println("Element not found");
	}
	else 
	{
		System.out.println("Element "+list1[result2]+" is find at "+result2);
	}
	
	// for insertion sort for integer
	
	System.out.println("Insertion Int Enter Length of list :");
	int NL= sc.nextInt();
	
	int list_i[] = new int[NL];
	
	System.out.println("Enter The Elements For Insertion Sort :");
	
	for(int i=0;i<NL;i++)
		list_i[i] = sc.nextInt();
	
	int N_i = list_i.length;
	
	com.bridgelabz.utility.Utility_3.insertion_i(list_i,N_i);
	
	System.out.println("Sorted list is :");
	
	for(int i=0;i<N;i++) {
		System.out.print(list_i[i]+" ");
	}
	
	// for insertion sort for word
	
	System.out.println("Insertion Word Enter Length of word list :");
	
	int NL_i_w= sc.nextInt();
	
	String list_i_w[] = new String[NL_i_w];
	
	System.out.println("Enter The Elements For Insertion Sort :");
	
	for(int i=0;i<NL_i_w;i++)
		list_i_w[i] = sc.nextLine();

	int N_i_w = list_i_w.length;

	com.bridgelabz.utility.Utility_3.insertion(list_i_w,N_i_w);
	
	System.out.print("Sorted list is :");
	
	for(int i=0;i<N_i_w;i++) {
		System.out.print(list_i_w[i]+" ");
		
	}
	
	//bubble sort integer
	
	System.out.println("Bubble Int Enter Length of list :");
	int NL_b_i= sc.nextInt();
	
	int list_b_i[] = new int[NL_b_i];
	
	System.out.println("Enter The Elements For bubble Sort :");
	
	for(int i=0;i<NL_b_i;i++)
		list_b_i[i] = sc.nextInt();
	
	int N_b_i = list_b_i.length;

	com.bridgelabz.utility.Utility_3.bubble_i(list_b_i,N_b_i);
	
	System.out.println("Sorted list is :");
	
	for(int i=0;i<N;i++) {
		System.out.print(list[i]+" ");
		
	}
	//bubble sort for word
	
	System.out.println("Bubble Word Enter Length of list :");
	int NL_b_w= sc.nextInt();
	
	String list_b_w[] = new String[NL_b_w];
	
	System.out.println("Enter The Elements For bubble Sort :");
	
	for(int i=0;i<NL_b_w;i++)
		list_b_w[i] = sc.nextLine();
	
	int N_b_w = list_b_w.length;

	com.bridgelabz.utility.Utility_3.bubble_w(list_b_w,N_b_w);
	
	System.out.println("Sorted list is :");
	
	for(int i=0;i<N;i++) {
		System.out.print(list[i]+" ");
		
	}
	sc.close();
}
}