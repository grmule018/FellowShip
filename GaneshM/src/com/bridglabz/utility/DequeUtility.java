/**
 * Purpose: Deque utility
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 09-09-2019
 **/package com.bridglabz.utility;

public class DequeUtility <T>
{
	Node <T> front;
	Node <T> rear;
	public int size=0;
	
	public void addFront(Object data)
	{
		size++;
		Node <T> newNode = new Node<T>();
		newNode.data = data;
		if(front == null)
		{
			front = rear = newNode;
		}
		else
		{
			newNode.next = front;
			front = newNode;
		}
		
	}
	
	public void addRear(Object data)
	{
		size++;
		Node <T> newNode = new Node<T>();
		newNode.data = data;
		if(front == null)
		{
			front = rear = newNode;
		}
		else
		{
			rear.next = newNode;
			rear = rear.next;
		}	
	}
	
	public Object removeFront()
	{
		size--;
		Node <T> tempNode = new Node<T>();
		tempNode = front;
		front = front.next;
		Object deleted = tempNode.data;
		tempNode = null;
		return deleted;
	}
	
	public Object removeRear()
	{
		size--;
		Object deleted = null;
		
		Node <T> tempNode = new Node<T>();
		tempNode = front;
		if(tempNode == null)
		{
			System.out.println("Linked List is Empty");
		}
		else if(tempNode.next==null)
		{
			deleted = tempNode.data;
			tempNode = null;
		}
		else
		{
			while(tempNode.next!=rear)
			{
				
				tempNode = tempNode.next;
			}
			rear = tempNode;
			
			tempNode = tempNode.next;
			deleted = tempNode.data;
			rear.next = null;
			tempNode = null;
		}
		
		return deleted;
	}

	public void viewDequeByFront()
	{
		Node <T> tempNode = new Node<T>();
		tempNode = front;
		System.out.print("By Using Front ");
		while(tempNode!=null)
		{
			System.out.print(" "+tempNode.data);
			tempNode = tempNode.next;
		}
		System.out.println(" ");
	}
}
