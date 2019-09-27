package com.bridgelabz.designpatterns.creational.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable{
	
	public static final SerializableSingleton instance = new SerializableSingleton();
		
	private SerializableSingleton(){}
	    
	protected Object readResolve() {
		return instance;
	}

}

