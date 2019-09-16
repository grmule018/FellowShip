/******************************************************************************
 *  Compilation:  javac -d bin Address.java
 *  Execution:    java -cp bin com.bridgelabz.oops.Address.java n
 *  
 *  Purpose: Creates a plain old java object to achieve encapsulation and for
 *  		 reusability of the code
 ******************************************************************************/

package com.grm.oops.addressbook;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private long zipcode;
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public long getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
}
