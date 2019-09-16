/**
 * purpose: Sorting using linked list.
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 2-09-2019
 **/
package com.grm.datastructure;

import com.grm.datastructure.Order;

public class Order_W {
	
	public static void main(String[]args) {
		
		Order order=new Order();
	{
		
		order.add(20);
		order.add(22);
		order.add(13);
		order.add(26);
		order.add(15);
		order.add(29);
		System.out.println("Unsorted ");
		order.display();
		order.sort();
		System.out.println("Sorted");
		order.display();
	}
	}
}