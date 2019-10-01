package com.phone;

public class OperationFactory 
{	
	public OS getInstance(String str) 
	{
		if (str.equals("Android"))
			return new Android();
		else if (str.equals("Ios"))
			return new IOS();
		else//(str.equls("Windows"))
			return new Windows();
	}

}
