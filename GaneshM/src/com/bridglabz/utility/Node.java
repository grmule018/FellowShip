/**
 * Purpose:Node class for linked list
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 05-09-2019
 **/

package com.bridglabz.utility;

public class Node <T>{
//creating node
	public Object data;
	public Node<T> next;
//assign values	
	public Node()
	{
		this.data = null;
		this.next = null;
	}
}
