package com.bridgelbaz.creational.singleton;

public class singletondemo {
	public static void main(String[]args) 
	{
		Singleton.GetSingletonInstance().printSingleton();
		Singleton.GetSingletonInstance().printSingleton();
		Singleton.GetSingletonInstance().printSingleton();
	}

}
