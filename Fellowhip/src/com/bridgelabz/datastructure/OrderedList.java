/******************************************************************************
 *  Compilation:  javac -d bin OrderedList.java
 *  Execution:    java -cp bin com.bridgelabz.datastructure.OrderedList n
 *  
 *  Purpose: �> Read .a List of Numbers from a file and arrange it ascending Order in a
 *  			Linked List. Take user input for a number, if found then pop the number out of the
 *  			list else insert the number in appropriate position
 *
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 ******************************************************************************/

package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.utility.CustomLinkedList;
import com.bridgelabz.utility.Utility;

public class OrderedList{
	
	/*
	* The main function is to read from a file and sort the elements
	* in ascending order to find the searched data and write the 
	* result into a file
	*/
	public static void main(String[] args) throws IOException {
		
		//Customized Linked List
		CustomLinkedList<Integer> ds=new CustomLinkedList<>();
		String filename=" /home/user/Downloads/RELEASE/Fellowhip/src/com/bridgelabz/datastructure/Hashing.csv";
		FileReader fr=new FileReader(filename);
		BufferedReader br=new BufferedReader(fr);
		String number[]=new String[100];
		String num;
		String delimitor=",";
		while((num=br.readLine())!=null){
			number=num.split(delimitor);
		}
		Integer [] intArr=new Integer[number.length];
		for(int i=0;i<intArr.length;i++)
		{
			intArr[i]=Integer.valueOf(number[i]);
		}
		
		////Method 1- using function of CustomLinkedList class of
		
		Integer[] sorted=Utility.sort(intArr);
		
		for(int numb:sorted){
		
			//Method 2- using function of CustomLinkedList class of
		
			ds.add(numb);
		}
		
		System.out.println("The numbers in the file are:");
		
		//Method 3- using function of CustomLinkedList class of
		
		ds.printList();
		
		System.out.println("Enter the choice");
		int n=0;
		do{
			System.out.println("1:Search for a number  2:Final Write  3:Exit");
			int choice=CustomLinkedList.userInt();
			switch(choice){
			case 1:	System.out.println("Enter the number to be searched");
					int user_num=CustomLinkedList.userInt();
					
					//Method 4- using function of CustomLinkedList class of
		
					
					boolean rs=ds.search(user_num);
					if(rs){
						System.out.println("Number is found");
						System.out.println("Fetching the index of the number");
						
						//Method 5- using function of CustomLinkedList class of
		
						int index=ds.index(user_num);
						
						System.out.println(index);
						
						//Method 6- using function of CustomLinkedList class of

						ds.remove(index);
						
						System.out.println("The list after removing the number");
						
						//Method 7- using function of CustomLinkedList class of

						ds.printList();
					}
					else{
						System.out.println("Number not found");
						ds.add(user_num);
						String[] array=new String[ds.size()];
						
						//Method 8- using function of CustomLinkedList class of

						String array1[]=ds.convArray(array);
						
						//Method 9- using function of CustomLinkedList class of

						int[] intArray=ds.convertIntArray(array1);
						
						int[] sorted_array=ds.sort(intArray);

						for(int i:sorted_array)
							ds.add(i);
						System.out.println("The list after adding the not found element");
						ds.printList();
					}
					break;
			case 2: System.out.println("Writing the modifications into the file..");
					
					
					//Method 10- using function of CustomLinkedList class of

					int leng=ds.size();
					String[] res_array=new String[leng];
					String[] result=ds.convArray(res_array);
					Utility.fileWriter(result,filename);
//					for(int i=0;i<result.length;i++){
//						bw.write(result[i]+", ");
//					}
//					br.close();
//					bw.close();
					break;
		   case 3: System.out.println("Invalid choice");
				   System.exit(0);
		
		}
			n++;
		}while(n<10);
		br.close();
	}
}
