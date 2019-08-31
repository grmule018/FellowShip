package com.bridgelabz.datastructures;

import com.bridgelabz.utility.StackUtility;

public class StackWork {

	public static <T> void main(String[] args) 
	{
		StackUtility <T> stack = new  StackUtility<T>();
		stack.push("Vaibhav");
		stack.push("Ganesh");
		stack.push("suraj");
		stack.push("Mark");
		stack.viewStack();
		Object value = stack.peek();
		System.out.println("Top Element = "+value);
		stack.viewStack();
		Object deleted = stack.pop();
		System.out.println("removed = "+deleted);
		stack.viewStack();
		deleted = stack.pop();
		System.out.println("removed = "+deleted);
		stack.viewStack();
		boolean isEmpty = stack.isEmpty();
		if(isEmpty)
		{
			System.out.println("Stack is not empty");
		}
		else
		{
			System.out.println("Stack list is empty");	
		}
		
		int length = stack.size();
		System.out.println("Length = "+length);
	}

}
