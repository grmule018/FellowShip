/**
 * purpose: Balanced parenthesis.
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 3-09-2019
 **/
package com.grm.datastructure;

import com.grm.utility.*;

public class BalancedParanthesis 
{
	public static <T> void main(String[] args) 
	{
		StackUtility <T> stack = new  StackUtility<T>();
		System.out.println("Enter The Expression");
		String expression = new String();
		expression = Utility.StringInput();
		int top = 0;
		
		char expressionArray[] = expression.toCharArray();
		
		for(int i = 0; i<expressionArray.length; i++)
		{
			if(expressionArray[i]=='('||expressionArray[i]=='['||expressionArray[i]=='{')
			{
				top++;
				stack.push(expressionArray[i]);
			}
			
			else if(expressionArray[i]==')'||expressionArray[i]==']'||expressionArray[i]=='}')
			{	
				if(top==0)
				{
					top=-1;
					break;
				}
				top--;
				stack.pop();
			}
		}
		
		if((stack.isEmpty())&&(top==0))
		{
			System.out.println("Expression has balanced paranthesis");
		}
		else
		{
			System.out.println("Expression has not balanced paranthesis");
		}
		
	}
	
}
