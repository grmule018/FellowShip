package com.bridglabz.datastructures2;

import com.bridglabz.utility.QueueUtility;
import com.bridglabz.utility.Utility;

public class CashCounter {

	public static <T> void main(String[] args) 
	{
		int cashAvailable = 50000;
		QueueUtility <T> cashCounterQueue = new QueueUtility<T>();
		cashCounterQueue.enqueue(1);
		cashCounterQueue.enqueue(2);
		cashCounterQueue.enqueue(3);
		cashCounterQueue.enqueue(4);
		cashCounterQueue.enqueue(5);
		//cashCounterQueue.enqueue(0);
		cashCounterQueue.viewQueue();
		int choice = 0;
		while(true)
		{
			System.out.println("Enter Your Choice");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance");
			System.out.println("4. Exit");
			
			choice = Utility.integerInput();
			
			switch(choice)
			{
				case 1:		cashAvailable = QueueUtility.deposit(cashAvailable);
							System.out.println("Cash has been deposited");
							break;
							
				case 2: 	cashAvailable = QueueUtility.withdraw(cashAvailable);
							System.out.println("Cash has been Withdrawn");
							break;
		
				case 3:		
							System.out.println("Balance");
							cashAvailable = QueueUtility.balance(cashAvailable);
							
							break;
				case 4:		System.out.println("Thank You Visit Again..!!!");
							cashCounterQueue.dequeue();
							cashCounterQueue.viewQueue();
							break;
				default:	System.out.println("Enter Correct Choice");
					
			}
			
			if(cashCounterQueue.isEmpty())
			{
				System.out.println("Queue is empty");
				break;
			}
			
		}
		
		//cashCounterQueue.dequeue();		
		
		//cashCounterQueue.viewQueue();
	}

}
