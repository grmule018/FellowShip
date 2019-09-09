/**
 * Purpose: Stack utility 
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 03-09-2019
 **/package com.bridglabz.utility;

public class StackUtility <T>
{	//creating node
	
	Node <T> head;
	
	//function for push item in stack
	
	public  void push(Object item)
	{
		Node<T> newNode = new Node<T>();
		newNode.data =  item;
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			newNode.next =   head;
			head = newNode;
		}
	}
	
	//function for pop item in stack
	
	public boolean pop()
	{
		Node <T> tempNode = head;
		
		if(head.next == null)
		{
			return false;
		}
		else
		{
			head = head.next;
			Object deleted = tempNode.data;
			tempNode = null;
			return true;
		}
	}
	
	//function for peek item from the stack
	
	public Object peek()
	{
		Object topElement = null;
		topElement = head.data;
			
		return topElement;
	}
	
	public boolean isEmpty()
	{
		if(head == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	//function for getting size of stack
	
	public int size()
	{
		int top=0;
		Node <T> tempNode = new Node<T>();
		tempNode = head;
		while(tempNode!=null)
		{
			top++;
			tempNode = tempNode.next;
		}
		return top;
	}
	
	//function for view stack
	
	public void viewStack()
	{
		Node <T> tempNode = new Node<T>();
		tempNode = head;
		System.out.print("Stack Elements = ");
		while(tempNode!=null)
		{
			System.out.print(tempNode.data+" ");
			tempNode = tempNode.next;
		}
		System.out.println(" ");
	}
	
	//function for  view stack anagram
	
	public int viewStackAnagram() 
	{
		Node <T> tempNode = new Node<T>();
		tempNode = head;
		int iCnt = 0;
		while(tempNode!=null)
		{
			if(iCnt<2)
			{
				System.out.println(tempNode.data+" ");
				iCnt++;
			}
			else
			{
				System.out.println();
				iCnt = 0;
			}
			
			tempNode = tempNode.next;
		}
		System.out.println(" ");
		return iCnt;
	}

}
