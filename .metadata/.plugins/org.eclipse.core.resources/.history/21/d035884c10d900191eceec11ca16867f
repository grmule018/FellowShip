package com.bridgelabz.addressbook;

import java.util.Scanner;

import org.codehaus.jackson.annotate.JsonProperty;

import com.bridgelabz.utility.Utility;

public class Address 
{
	static Scanner sc=new Scanner(System.in);
	@JsonProperty
	private String city;
	@JsonProperty
	private String state;
	@JsonProperty
	private int pinCode;
	
	public String getCity() 
	{
		return city;
	}

	public void setCity() 
	{
		System.out.println("Enter City ");
		this.city = Utility.scanString();
	}
	
	public String getState() 
	{
		return state;
	}
	
	public void setState() 
	{
		System.out.println("Enter The State");
		this.state = Utility.scanString();
	}
	
	public int getPinCode() 
	{
		return pinCode;
	}
	
	public void setPinCode() 
	{
		System.out.println("Enter Pin Code");
		this.pinCode = Utility.scanInt();
	
	}
}
