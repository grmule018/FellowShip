/**
 * Purpose;  2D Array
 * Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from standard 
 * input and printing them out to standard output.
 * I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
 * Logic -> create 2 dimensional array in memory to read in M rows and N cols 
 * O/P -> Print function to print 2 Dimensional Array. 
 * In Java use PrintWriter with Output Stream Writer to print the output to the screen.
 */
package com.bridgelabz.functional;
import java.util.Scanner;
import java.io.PrintWriter;

public class Two_D_Array_9 {
	public static void main(String[] args) {
	int row, col;
	int arr[][] = new int[10][10];     
	
	PrintWriter writer = new PrintWriter(System.out);
	
	Scanner sc =new Scanner(System.in);
	
	writer.write("Enter The Number of rows :");
	writer.flush();
	row= sc.nextInt();
	
	writer.write("\nEnter The Number of columns :");
	writer.flush();
	col= sc.nextInt();
	
	writer.write("\nEnter The value for matrix :");
	writer.flush();
	for(int i=0; i< row; i++)
		for(int j=0; j< col; j++)
			arr[i][j]= sc.nextInt();
	
	System.out.println();
	
	writer.write("The Matrix is as Follows \n");
	writer.flush();
	
	for(int i=0; i< row; i++)
	{
		for(int j=0; j< col; j++)
		{
			writer.write(arr[i][j]+ "  ");
			writer.flush();  
		}
			
			/*
			System.out.print(arr[i][j]+ "  ");
			*/
		System.out.println(" ");
	}
	
	sc.close();
	writer.close();
	}
}
