/**
 * purpose: instertion sort for Integers.
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 29-08-2019
 **/
package com.bridglabz.algorithm;

public class SimpleInsertionsort {

	public static void main(String[] args) {
		int[]a= {9,8,6,7,5,4,1} ;
		
		int temp ,j;
		for( int i=1;i<a.length;i++)
		{ temp=a[i];
			j= i;
			
			while(j>0 &&a[j-1]>temp)
			{a[j]=a[j-1];
			j=j-1;
			
			}
			a[j]=temp;
		}System.out.println("Sorted Array :");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}	
}

