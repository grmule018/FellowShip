/**
 * Purpose: Sorting utility
 *  
 * @author Ganesh Mule
 * @version 1.0
 * 
 **/

package com.bridgelabz.utility;

public class Utility_3 {
	// for binary Integer
	
	public static int binarySearch_i(int list[],int start,int end,int N) {
		
		if(end >= start) {
			int mid = start + (end-start)/2;
			
			if(list[mid] == N)
				return mid;
			else if(list[mid]>N)
				return binarySearch_i(list,start,end-1,N);
			else
				return binarySearch_i(list,start,end+1,N);
		}
		else
			return -1;
	}
	
	// For binary word
	
	public static int binarySearch_w(String list1[],int start1,int end1,String N1) {
		
		if(end1 >= start1) {
			int mid = start1 + (end1-start1)/2;

			if(list1[mid].compareTo(N1) == 1)
				return mid;
			else if(list1[mid].compareTo(N1)>0)
				return binarySearch_w(list1,start1,end1-1,N1);
			else
				return binarySearch_w(list1,start1,end1+1,N1);
		}else
			return -1;
	}
	
	//insertion for integer
	
	public static void insertion_i(int list_i[],int N) {
		for(int i=0;i<N;i++) {
			int prev = list_i[i];
			int j=i-1;
			
			while(j>=0 && list_i[j]>prev) {
				list_i[j+1]= list_i[j];
				j=j-1;
			}
			list_i[j+1]=prev;
		}
				
	}
	
	// insertion for word
	
	public static void insertion(String list_i_w[],int N_i_w) {
		for(int i=0;i<N_i_w;i++) {
			String prev = list_i_w[i];
			int j=i-1;
			
			while(j>=0 && list_i_w[j].compareTo(prev) > 0) {
				list_i_w[j+1]= list_i_w[j];
				j=j-1;
			}
			list_i_w[j+1]=prev;
		}
		
	}
	
	// bubble sort for integer
	
	public static void bubble_i(int list[],int N)
	{
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
	
	// bubble sort word
	
	
	public static void bubble_w(String list[],int N)
	{
		for(int i=0;i<N-1;i++) {
			
			for(int j=0;j<N-i-1;j++)
			{
				if(list[j].compareTo(list[j+1]) < 0)
				{
					String temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	
	}

}
