/**
 * 
 */
package com.bridglabz.oops;
import com.bridglabz.utility.Utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

	
public class Regex2
{
	private String firstName;
	private String lastName;
	private String fullName;
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String fName) {
		this.firstName = fName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lName) {
		this.lastName = lName;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fName) {
		this.fullName = fName;
	}

		
		public static void main(String[] args) 
		{

		String string = "Hello <<name>>, We have your full name as <<full name>> in our system. \n"
					+ " * your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clearification"
					+ " Thank you BridgeLabz \n"
					+ " * 12/12/2019";

		System.out.println("Enter your first name");
		String fName = Utility.StringInput();
		System.out.println("Enter your last name");
		String lName = Utility.StringInput();

		String fullname = fName + " " + lName;

		Pattern r = Pattern.compile("[a-zA-Z]+");

		if (r.matches("[a-zA-z]+", fName))
		{
			string = string.replaceAll("<<name>>", fName);
			string = string.replaceAll("<<full name>>", fullname);
		}
		System.out.println("Enter 10 digit mobile number");
		String MbNo = Utility.StringInput();
		
		if (Pattern.matches("[6789][0-9]{9}", MbNo))
		{
			string = string.replaceAll("x{10}", MbNo);
		}

		LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedString = localDate.format(formatter);
		string = string.replaceAll("12/12/2019", formattedString);
		System.out.println(string);
	}
}
