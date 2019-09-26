package com.bridgelabz.designpatterns.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	public static synchronized ThreadSafeSingleton getInstance() {
    
    
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
	
	//The following code snippet provides the double-checked locking implementation.

	public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
	    if(instance == null){
	        synchronized (ThreadSafeSingleton.class) {
	            if(instance == null){
	                instance = new ThreadSafeSingleton();
	            }
	        }
	    }
	    return instance;
	}
}


