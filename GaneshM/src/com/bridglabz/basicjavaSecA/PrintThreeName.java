/******************************************************************************
 *  Purpose: Print three name in reverse .
 *  @author  Ganesh Mule
 *  @version 1.0 
 * 	@since   31-07-2019
 *******************************************************************************/

package com.bridglabz.basicjavaSecA;

import java.util.Scanner;

public class PrintThreeName {
	public static void main(String[]args) {
	Scanner user_input = new Scanner(System.in);
	String Firstname;
	System.out.println("Enter Your Firstname:");
	Firstname = user_input.next();
	
	String Secondname;
	System.out.println("Enter Your Secondname:");
	Secondname = user_input.next();
	
	String Thirdname;		
	System.out.println("Enert your Thirdname:");
	Thirdname = user_input.next();
	
	String fullname;
	fullname= Thirdname + Secondname + Firstname ;
	System.out.println("Hii "+ fullname);
	user_input.close();
}}
