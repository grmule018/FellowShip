package com.bridglabz.datastructures2;

import com.bridglabz.utility.QueueUtility;

public class QueueWorkInt {

	public static <T> void main(String[] args) {
		
		QueueUtility <T> queue = new QueueUtility<T>(); 
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.enqueue(70);
		queue.enqueue(80);
		
		queue.viewQueue();
		
		Object deleted = queue.dequeue();
		System.out.println("Removed = "+deleted);
		
		queue.viewQueue();
		deleted = queue.dequeue();
		System.out.println("Removed = "+deleted);
		deleted = queue.dequeue();
		System.out.println("Removed = "+deleted);
		deleted = queue.dequeue();
		System.out.println("Removed = "+deleted);
		deleted = queue.dequeue();
		
		System.out.println("Removed = "+deleted);
		queue.viewQueue();
		
		System.out.println("Removed = "+deleted);
		queue.viewQueue();
		
		deleted = queue.dequeue();
		System.out.println("Removed = "+deleted);
		
		deleted = queue.dequeue();
		System.out.println("Removed = "+deleted);
		
		deleted = queue.dequeue();
		System.out.println("Removed = "+deleted);
		
		boolean queueStatus = queue.isEmpty();
		if(queueStatus==true)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("Queue is not Empty");
		}
		
		System.out.println("length = "+queue.size);
		
	}

}
