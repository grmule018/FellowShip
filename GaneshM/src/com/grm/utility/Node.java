/**
* Purpose:Node class for linked list
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 05-09-2019
 **/

package com.grm.utility;

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
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
}