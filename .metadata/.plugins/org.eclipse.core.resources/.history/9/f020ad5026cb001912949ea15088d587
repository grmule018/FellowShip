package com.bridgelabz.utility;

public class LinkedListXX 
{
	public Node head;
	public void orderedList()
	{
		head.data = 0;
		head.next = null;
	}
	
	public void add(int item)
	{
		int count = 1;
		Node newNode = new Node();
		newNode.data = item;
		
		if(head == null)
		{
			head = newNode;
		}


		else 
		{
			Node tempNode = new Node();
			tempNode = head;
			Node temp = head;
		while(true)
		{
			if(newNode.data<head.data)
			{
				addAtFirst(newNode);
				break;
			}
			else if((newNode.data>tempNode.data))
			{
				count++;
				tempNode = tempNode.next;
				if(newNode.data<tempNode.data)
				{
					addAtPosition(count, newNode);
					break;
				}
				else if(newNode.data>tempNode.data)
				{
					count++;
					tempNode = tempNode.next;
					if(newNode.data>tempNode.data&&newNode.data<tempNode.next.data)
					{
					addAtPosition(count, newNode);
					
					}
					break;
				
				}
			}
		
		}
	}
		
		//	else if((new Node.data > head.data)&&(newNode.data<head.next.data))
		//	{
		//	count++;
		//	}
		//	else
		//	{
		//	Node tempNode = new Node();
		//	tempNode = head;
		//	while(tempNode.next.next != null)
		//	{
		//	if((item>tempNode.data)&&(item<tempNode.next.data))
		//	{
		//	count++;
		//	addAtPosition(count, newNode);
		//	break;
		//	}
		//	else if((item>tempNode.data)&&(item>tempNode.next.data))
		//	{
		//	count++;
		//	}
		//	else
		//	{
		//	
		//	}
		//	}	
		//	}	
		}
//		else
//		{
//			Node tempNode = head;
//			while(tempNode.next != null)
//			{
//				tempNode = tempNode.next;
//			}
//			tempNode.next = newNode;
//			
//		}
		
	
	
	
	
	 
	private void addAtFirst(Node newNode)
	{
		newNode.next = head;
		head = newNode;
	}
	
	private void addAtLast(Node newNode)
	{
		Node tempNode = new Node();
		tempNode = head;
		while(tempNode.next!=null)
		{
			tempNode = tempNode.next;
		}
		tempNode.next = newNode;
	}
	
	private void addAtPosition(int position, Node newNode)
	{
		int count = 1;
		Node tempNode = new Node();
		tempNode = head;
		
		while(count!=position-1)
		{
			count++;
			tempNode = tempNode.next;
		}
		
		newNode.next = tempNode.next;
		tempNode.next = newNode;
	}
	
	public void display()
	{
		Node tempNode = new Node();
		tempNode = head;
		while(tempNode!=null)
		{
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
	}
	
	public void sortAscending(int length)
	{
		
		for(int i = 0; i<length; i++)
		{
			Node tempNode = head;
			int temp = tempNode.data;
			while(tempNode!=null)
			{
				if(temp>tempNode.data)
				{
					
				}
			}
		}
	}
}
