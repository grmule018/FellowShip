

package com.bridglabz.datastructures2;

import com.bridglabz.utility.LinkedList_Data;

public class LinkedList_Dataword <T>
{
	public static <T>void main(String[] args) 
	{
		LinkedList_Data <T> list = new LinkedList_Data<T>();
		list.insert("hii");
		list.insert("hello");
		list.insert("how");
		
//		list.displayNodes();
//		list.insertAtFirst(10);
		list.displayNodes();
//		

//		list.insertLast(20);
//		list.displayNodes();
		
		int count = list.countNodes();
		System.out.println("Count"+count);
	}
}
