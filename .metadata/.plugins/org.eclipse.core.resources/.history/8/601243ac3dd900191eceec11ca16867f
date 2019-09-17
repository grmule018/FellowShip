/**
 * purpose:Anagram Prime numbers in 2D array
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 4-09-2019
 **/

package com.grm.datastructure;

import com.grm.utility.QueueUtility;
import com.grm.utility.Utility;

public class AnagramToQueue  {

	public static void main(String[] args) {
		QueueUtility queue=new QueueUtility();
		int y = 0;
		int[] arr = new int[170];

		for (int i = 1; i <= 1000; i++) {
			boolean flag = true;

			for (int j = 2; j < i - 1; j++) {
					
				if (i % j == 0) 
				{
					flag = false;
					break;
				}
			}
			if (flag == true) {
				arr[y] = i;
				y++;
			}
				
			}
		
		int[] a= new int[170];
		
		for(int i=0;i<arr.length;i++)
		{
			a[i]=arr[i];
		}
						
		StringBuffer sb= new StringBuffer(arr.length);
		
		String s=" ";
			
		for(int i=0;i<arr.length;i++)
		{
			s=sb.append(a[i]+" ").toString();
		}
			
		String[] str=s.split(" ");
			
		
		boolean flag=true;
		String[][] s1=new String[arr.length][arr.length];
				
		for(int k=0;k<str.length-1;k++)
		{
			for(int l=k+1;l<str.length;l++)
			{
				flag=Utility.StringAnagram(str[k], str[l]);
						
			if(flag==true)
			{
				s1[k][l]=str[k]+" "+str[l];
			System.out.println(s1[k][l]);
				queue.enqueue(s1[k][l]);
			}
		}
		}
		queue.viewQueue();
	}	
	
}
