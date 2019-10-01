package com.bridgelabz.controller;

import com.bridglabz.service.AddressBookImpl;
import com.bridglabz.service.Addressbook;

public class AddressBookApp{
	public static void main(String[] args) {
		Addressbook ab = new AddressBookImpl();
		ab.close();
	}
}
