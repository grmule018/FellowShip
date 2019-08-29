/**
 * purpose: Binary Search the Word from Word List
 * Desc -> Read in a list of words from File. Then prompt the user to enter a word to search the list. The program reports if the search word is found in the list.
 * I/P -> read in the list words comma separated from a File and then enter the word to be searched
 * Logic -> Use Arrays to sort the word list and then do the binary search
 * O/P -> Print the result if the word is found or not

 * @author Ganesh Mule
 * @version 1.0
 * @since 24-08-2019
 **/
package com.bridglabz.Algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class Binary_w_w_6 {
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		File f=new File("/home/user/Downloads/RELEASE/GaneshM/src/com/bridglabz/Algorithm");
		BufferedReader br=new BufferedReader(new FileReader(f));
		String s;
		String list[] = null;
		while((s=br.readLine()) != null)
		{
			list=s.split(",");
		}

		Arrays.sort(list);

		for(int i=0;i<list.length;i++)
			System.out.println(list[i]+" ");

		System.out.print("Enter the search value :");
		String N = sc.nextLine();

		int start = 0;
		int end = list.length;

		int result = com.bridglabz.utility.Utility_3.binarySearch_w(list,start,end-1,N);

		int result1= result-1;

		if(result == -1) {
			System.out.print("Element not found");
		}else {
			System.out.print("Element "+list[result1]+" is find at "+result1);
		}
		br.close();
		sc.close();
	}

}