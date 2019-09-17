/**
 * Purpose: Linked list for generics
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 04-09-2019
 **/
package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;



public class LinkedListU<T> {
	Node<T> head;
	
	public class Node<T>
	{
		Object data;
		Node<T> next;
		
		public Node(Object nData)
		{
			data = nData;
			next = null;
		}
		
		public Node(Object nData, Node<T> nNode)
		{
			data = nData;
			next = nNode;
		}
	}

	// Adds at the end of the list
	public void addAtEnd(Object obj1)
	{
		Node<T> node = new Node<T>(obj1);
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node<T> tmpNode = head;
			
			while(tmpNode.next != null)
			{
				tmpNode = tmpNode.next;
				
			}
			tmpNode.next = node;
		}
 	}
	
	// Adds at the start of the list
	public void addAtStart(Object obj1)
	{
		Node<T> node = new Node<T>(obj1);
		if(head==null)
		{
			head = node;
		}
		else 
		{
			node.next = head;
			head = node;
		}
	}
	
	// Work in progress.
	public boolean search(Object obj1) 
	{
		Node<T> node = head;
		while(node != null)
		{
			String tmpString = node.data+""; 
			if (tmpString.equals(obj1))
			{
				return true;
			}
			node = node.next;
		}
		return false;
	}
	
	public void remove(Object item) 
	{
		Node<T> node = head;
		
		// Converting to string so that we can compare any objects passed.
		String str1toCompare = item+"";
		String str2toCompare = node.data+"";
		if(head == null)
		{
			System.out.println("list is empty.");
			return;
		}
		else if(str2toCompare.equals(str1toCompare))
		{
			head = head.next;
			node.next = node.next.next;
		}
		else 
		{
			while(true)
			{
				while(node.next.data.equals(str1toCompare))
				{
					node.next = node.next.next;
					return;
				}
				node = node.next;
			}		
			
		}
	}
	
	public Object pop() 
	{
		Object object;
		Node<T> node = head;
		if(head == null)
			return "Nothing to pop";
		else 
		{
			while(node.next.next != null)
			{
				node = node.next;
				
			}
			object = node.next.data;
			node.next = null;
			return object;
		}
	}
	public int index(Object data)
	{
		Node<T> node = head;
		int count = 0;
		if(head == null)
			return count;
		else
		{
			while(node!=null)
			{
				count++;
				if(node.data==data)
				{
					return count;
				}
				else if(node.next==null || node.data!=data)
				{
					return -1;
				}
				node = node.next;
			}
			return count;
		}
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public int size() 
	{
		int count = 0;
		Node<T> node = head;
		
		if(head == null)
			return 0;
		else
		{
			while(node.next!=null)
			{
				count++;
				node = node.next;
			}			
		}		
	
		return count+1;      
	}

	public void display() 
	{
		Node<T> node = head;
		
		if(head == null)
		{
			System.out.println("The list is empty.");
		}
		else
		{
			System.out.print("Linked list = [");
			
	
			while(node!=null)
			{
		
				if(node.next==null)
				{
					System.out.print(node.data+"]");
				}
				else 
				{
					System.out.print(node.data+", ");
				}
				
				node = node.next;
			}
			System.out.println();
		}
	}
	
	public void writeDataToFile() throws IOException
	{
		FileWriter fileWriter = new FileWriter("/home/user/Downloads/RELEASE/GaneshM/src/com/grm/datastructure/Read.txt");
		try (PrintWriter printWriter = new PrintWriter(fileWriter)) 
		{
			String tmpString = "";
			Node<T> node = head;
			while(node != null)
			{
				tmpString = tmpString + node.data + " ";
				node = node.next;
			}
			tmpString = tmpString.trim();
			printWriter.write(tmpString);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
}