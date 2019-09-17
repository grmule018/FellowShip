/**
 * Purpose: Queue Utility for queue 
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 03-09-2019
 **/
package com.bridgelabz.utility;

public class QueueUtility<T> 
{ 
	//Creating node 
	
	Node <T> front;
	Node <T> rear;
	public int size=0;
	
	//function for enqueue in list
	
	public void enqueue(Object item)
	{
		Node<T> newNode = new Node<T>();
		newNode.data =  item;
		if(front == null)
		{
			front = rear = newNode;
			size++;
		}
		else
		{
			size++;
			rear.next = newNode;
			rear = rear.next;
		}
	}
	//function for dequeue in list
	
	public Object dequeue()
	{
		Node<T> tempNode = new Node<T>();
		tempNode = front;
		if(front.next==null)
		{
			size--;
			return front.data;
		}
		else
		{
			size--;
			front = front.next;
			Object tempData =  tempNode.data;
			tempNode = null;
			return tempData;
		}
	}
	
	//function for view the queue
	
	public void viewQueue()
	{
		Node<T> tempNode = new Node<T>();
		tempNode = front;
		System.out.print("Queue = ");
		while(tempNode!=null)
		{
			System.out.print("  "+tempNode.data);
			tempNode = tempNode.next;
		}
		System.out.println("");
	}
	
	//function checking queue is empty or not
	
	public boolean isEmpty()
	{
		if(front==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//function for deposit cash in bank
	
	public static int deposit(int cashAvailble) 
	{
		System.out.println("Enter The Amount to Deposite");
		int amountToDeposit = Utility.integerInput();
		cashAvailble = cashAvailble+amountToDeposit;
		return cashAvailble;
	}
	
	// function for withdraw cash from bank
	
	public static int withdraw(int cashAvailable) 
	{
		System.out.println("Enter The Amount to Withdraw");
		int amountToWithdraw = Utility.integerInput();
		cashAvailable = cashAvailable - amountToWithdraw;
		return cashAvailable;
	}
	
	// function for checking balance
	
	public static int balance (int cashAvailable)
	{
		int balance = cashAvailable ;
		System.out.println("Your available balance is:"+balance);
			
		return balance;
	}
}