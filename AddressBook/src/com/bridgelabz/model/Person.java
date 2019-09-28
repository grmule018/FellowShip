/******************************************************************************
 *   *  
 *  Purpose: Creates a plain old java object to achieve encapsulation and for
 *  		 reusability of the code
 *
 *  ******************************/

package com.bridgelabz.model;

public class Person {
	private String firstName;
	private String lastName;
	private long contactNo;
	private Address address;
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
