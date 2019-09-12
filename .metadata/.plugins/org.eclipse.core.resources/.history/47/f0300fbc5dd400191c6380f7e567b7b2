/**
 * Purpose: prime numbers in 2d array
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 4-09-2019
 **/
package com.bridglabz.datastructures2;

public class PrimeNumber2d {

	public static void main(String[] args) {
	
	
		int k=0;
		
		int[] arr= new int[175];
		
		int count=0;
		
		for(int i=1;i<=1000;i++)
		{
			boolean flag=true;
			
			for(int j=2;j<i-1;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			
			if(flag==true)
			{
				arr[k]=i;
				k++;
				count++;
				//System.out.println(i);
			}
			
		}
		//System.out.println(count);
		/*
		 * for(int p=0;p<arr.length;p++) { System.out.println(arr[p]); }
		 */
		
		
		  int[][] primeNum= new int[10][167];
		  
		  for(int i=0;i<10;i++)
		  {
			  for(int j=0;j<167;j++)
			  {
					  if(arr[j]>(i*100) && arr[j]<((i+1)*100))
					  {
						  primeNum[i][j]=arr[j];
						  System.out.print(primeNum[i][j]+" ");
					  }   
			  }
			  
			  System.out.println();
		  }
		
		

	}

}
