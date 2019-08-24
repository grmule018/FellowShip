package com.bridglabz.basicjavaSecA;

import com.bridglabz.utility.Utility;

public class RepeatStringInitials {

	public static void main(String[] args) 
	{
		System.out.println("Enter a string:"); 
		String s=Utility.StringInput();
		       
		int length=s.length();
		System.out.println("length of atring: "+length);
		int[] count=new int[256];
		       
		for(int i=0;i<length;i++)
		{
		   count[s.charAt(i)]++;
		}
		   
		char [] ch=new char[length];
		for(int i=0;i<length;i++)
		{
			ch[i]=s.charAt(i);
		 int temp=0;
		 for (int j=0;j<length;j++)
		 {
			 if(ch[i]==ch[j])
			 {
				 temp++;
			 }
		 	   		
		 }
		 if(temp==1)
		 	{
			 System.out.println(s.charAt(i)+"   "+count[s.charAt(i)]);
		 	}
		 }
	}
}
