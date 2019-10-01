package com.bridgelbaz.creational.singleton;

public class Singleton {
	 
	private static Singleton singletonInstance;
	
	private  Singleton()
	{
		
	}
	
	public static Singleton GetSingletonInstance()
	{
		if(null== singletonInstance)
		{
			singletonInstance =new Singleton();
			System.out.println(("Inside  null, cheack object is created: "+singletonInstance.toString()));
		}
		return singletonInstance;
		
	}
	public void printSingleton()
	{
		System.out.println("inside print "+singletonInstance.toString());
		System.out.println("");
	}
	}

