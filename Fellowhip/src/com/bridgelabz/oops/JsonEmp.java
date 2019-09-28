/**
 * Purpose : creating simple example
  * @author Ganesh Mule
 * @version 1.0
 * @since 09-09-2019
 **/
package com.bridgelabz.oops;

import java.io.Serializable;

public class JsonEmp implements Serializable
{
	private int empNumber;
	private String name;
	private double salary;
	
	public int getEmpNumber() 
	{
		return empNumber;
	}
	
	public void setEmpNumber(int empNumber) 
	{
		this.empNumber = empNumber;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	
}
	


