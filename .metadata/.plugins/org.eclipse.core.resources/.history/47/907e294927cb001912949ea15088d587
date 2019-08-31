package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.bridgelabz.utility.LinkedListX;
import com.bridgelabz.utility.Utility;

public class Work <T>
{

	public static <T>void main(String[] args) throws Exception 
	{
		LinkedListX <T> list = new LinkedListX<T>();
		File file = new File("/home/user/abc.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = br.readLine();
		
		String strArray[] = str.split(" ");
		
		
		
		for(int i = 0;i<strArray.length;i++)
		{
			list.insert(strArray[i]);
		}
		
		
		
		list.displayNodes();
		int length = list.countNodes();
		System.out.println("length = "+length);
		
		System.out.println("Enter Word To be Searched");
		String word = Utility.scanString();
		int position = list.search(word, length);
		System.out.println("Element found at position "+position);
		if(position!=-1)
		{
			FileWriter fr = new FileWriter(file, true);
			BufferedWriter brw = new BufferedWriter(fr);
			list.deletAtPosition(position);
			list.displayNodes();
			length = list.countNodes();
			String newString[] = list.convertToStringArray(length);
			String finalString = " ";
			for(int i = 0;i<newString.length;i++)
			{
				
				finalString = finalString + newString[i]+"  ";
				
			}
			
//			brw.write(finalString);
//			brw.close();
//			fr.close();
		}
		else
		{
			
			list.insert(word);
			String newString[] = list.convertToStringArray(length);
			String finalString = " ";
			for(int i = 0;i<newString.length;i++)
			{
				finalString = finalString + newString[i];
			}
			FileWriter fr = new FileWriter(file, true);
			BufferedWriter brw = new BufferedWriter(fr);
			brw.write(finalString);
			brw.close();
			fr.close();
		}
		
		list.displayNodes();
		list.countNodes();
		
//		String strArrray[]=list.convertToStringArray(length);
//		for(int i=0;i<strArrray.length;i++)
//		{
//			System.out.println(strArrray[i]);
//		}
		br.close();
	}
}
