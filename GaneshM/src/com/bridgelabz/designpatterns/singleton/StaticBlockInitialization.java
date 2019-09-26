package com.bridgelabz.designpatterns.singleton;

public class StaticBlockInitialization {
	private static StaticBlockInitialization instance;
	private StaticBlockInitialization() {}
	
	//static block initialization for exception handling
	static {
		try {
			
			instance = new StaticBlockInitialization();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static StaticBlockInitialization getInstance() {
		return instance;
	}
}
