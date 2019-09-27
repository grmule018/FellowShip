package com.bridgelabz.designpatterns.behavioral.mediator;

public class ChatClient{
	
	public static void main(String[]args) {
		ChatMediator mediator =new ChatMediatorImpl();
		User user1 =new UserImpl( mediator,"Dipak");
		User user2= new UserImpl(mediator,"Lata");
		User user3 = new UserImpl(mediator,"Niraj");
		User user4 = new UserImpl(mediator,"RajKumar");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send(" Hi All");
	}
}