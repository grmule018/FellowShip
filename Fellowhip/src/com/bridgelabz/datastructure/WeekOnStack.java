/******************************************************************************
 *  Compilation:  javac -d bin WeekOnStack.java
 *  Execution:    java -cp bin com.bridgelabz.datastructure.WeekOnStack n
 *  
 *  Purpose: �> Create the Week Object having a list of WeekDay objects each 
 *  			storing the day (i.e S,M,T,W,Th,..) and the Date (1,2,3..) . 
 *  			The WeekDay objects are stored in a Queue implemented using 
 *  			Linked List. Further maintain also a Week Object in two stacks to
 *  			finally display the Calendar
 * 
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 ******************************************************************************/


package com.bridgelabz.datastructure;

import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;
import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.StackLinkedList;

public class WeekOnStack {
	
	/*
	* The main function is to take the input from the user 
	* and printing the calendar by using queue and stacks 
	*/
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		//Method 1- using function of FunctionalUtility class of
		//com.bridgelabz.util package
		if (month == 2 && FunctionalUtility.leapYear(year))
			days[month] = 29;
		System.out.println("\t\t " + months[month] + " " + year);
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		
		//Method 2- using function of AlgorithmUtility class of
		//com.bridgelabz.util package
		int d = AlgorithmUtility.dayOfWeek(month, 1, year);
		
		//Customized stack
		StackLinkedList<Queue<Integer>> customStack= new StackLinkedList<Queue<Integer>>();
		
		//Customized Queue
		Queue<Integer> queue=new Queue<Integer>();
		
		for (int i = 0; i < d; i++)
			System.out.print("\t");
		for (int i = 1; i <= days[month]; i++) {
		
			//Method 3- using function of Queue class of
	
			queue.insert(i);
			
			if (((i + d) % 7 == 0) || (i == days[month])) {
				
				//Method 4- using function of StackLinkedList class of
				
				customStack.push(queue);
				
				queue = new Queue<Integer>();
				continue;
			}
		}
		
		StackLinkedList<Queue<Integer>> stackLinkedList = new StackLinkedList<>();
		
		//Method 5- using function of StackLinkedList class of
	
		int size = customStack.getSize();
		
		for(int i=0; i < size; i++){
			
			//Method 6- using function of StackLinkedList class of
	
			stackLinkedList.push(customStack.pop());
		}

		for (int i = 0; i < size; i++) {
			Queue<Integer> week = stackLinkedList.pop();
			for (int j = 0; j < week.getSize(); j++) {
				
				//Method 7- using function of Queue class of
	
				System.out.print(week.remove() + "\t ");
				
			}
			System.out.println();
		}
	}
}
