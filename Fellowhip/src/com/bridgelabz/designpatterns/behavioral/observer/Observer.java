package com.bridgelabz.designpatterns.behavioral.observer;

public interface Observer {

	//Method to update  the observer , used by subject
	public void update();
	//attach subject with the observe
	public void setSubject(Subject sub);
}
