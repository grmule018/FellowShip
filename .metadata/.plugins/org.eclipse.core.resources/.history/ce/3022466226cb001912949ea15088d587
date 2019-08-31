package com.bridgelabz.utility;

public class LinkedListD 
{
	Node2 head;
	public void add(int data) 
	{
		int count = 1;
		Node2 newNode = new Node2();
		newNode.data = data;
		if(head==null)
		{
			head = newNode;
		}
		else
		{
			Node2 tempNode = head;
			
			if(newNode.data<tempNode.data)
			{
				tempNode.prev = newNode;
				newNode.next = tempNode;
				head = newNode;
			}
			else
			{
				count++;
				if((tempNode.next == null))
				{
					tempNode.next = newNode;
					newNode.prev = tempNode;
					head = tempNode;
				}
				else if((newNode.data>tempNode.data)&&(newNode.data<tempNode.next.data))
				{
					newNode.next = tempNode.next;
					tempNode.next = newNode;
					newNode.prev = tempNode;
					newNode.next.prev = newNode;
				}
				else
				{
					while((newNode.data>tempNode.data))	//&&(tempNode.next!=null)
					{
						tempNode = tempNode.next;
					}
					Node2 temp = tempNode.prev;
					temp.next = newNode;
					newNode.prev = temp;
					newNode.next = tempNode;
					tempNode.prev = newNode;
					
//					Node2 temp = tempNode.next.next;
//					tempNode.next = newNode;
//					newNode.prev = tempNode;
//					newNode.next = temp;
//					temp.prev = newNode;
					
				}
			}
			
		}	
	}
	
	public void display()
	{
		Node2 node = new Node2();
		node = head;
		
		while(node!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		
	}
	
}
