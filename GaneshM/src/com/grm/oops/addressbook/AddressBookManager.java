/******************************************************************************
  
 *  Purpose: The program is to maintain an address books
 *
 ******************************************************************************/

package com.grm.oops.addressbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.grm.utility.OopsUtility;


public class AddressBookManager {

	public Scanner sc=new Scanner(System.in);
	
	private static String charbook;
	
	private AddressBook addressBook = null;

	private static List<Person> listOfPersons = new ArrayList<Person>();

	
	private File[] getFiles() {
		return new File(System.getProperty("user.dir")).listFiles();
	}

	
	public void createBook() throws IOException {
		
		System.out.println("Enter name of address book");
		String book = sc.next();
		File file = new File(book + ".json");
		if (file.createNewFile()) {
			System.out.println("File is created");
		} else {
			System.out.println("File of that name already exists");
		}
	}

	
	public void openBook() throws IOException {
		System.out.println("Files available are:");
		File[] arrayOfFiles = getFiles();
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Choose the address book");
		String ch_book = sc.next();;
		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (ch_book.equals(filename)) {
				if (file.length() > 0) {
					System.out.println("Address book is not empty");
					String string = OopsUtility.readJsonFile(filename);
					listOfPersons = OopsUtility.userReadValue(string, AddressBook.class);

					// Function call to perform various operations on the opened address book
					addressBook();

				} else {
					System.out.println("Address Book is empty");
					System.out.println("Add new data onto the Address Book");
					addressBook();
				}
			}
		}
	}

	
	public void saveBook() {
		System.out.println("Saving " + charbook + " address book");
		File[] arrayOfFiles = getFiles();
		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (charbook.equals(filename)) {
				try {
					String json = OopsUtility.userWriteValueAsString(listOfPersons);
					//OopsUtility.writeToFile(filename, charbook);
					OopsUtility.writeFile(json, filename);
					System.out.println("Address book details saved");
				} catch (Exception e) {
					System.out.println("Cannot write to file");
			}
		}
	}
}

	public void saveAsBook() throws IOException {
		System.out.println("Files available are:");
		File[] arrayOfFiles = getFiles();
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Choose the address book you want to save as with extention");
		String charbook1 = sc.next();
		File file = new File(charbook1);
		if (file.createNewFile()) {
			System.out.println("File is created");
			String json = OopsUtility.userWriteValueAsString(listOfPersons);
			OopsUtility.writeFile(json, charbook);
			System.out.println("Address book details saved");
		} else {
			System.out.println("File of that name already exists");
		}
	}


	public void close() {
		System.out.println("Would you like to save the changes? Y / N");
		String answer = sc.nextLine();
		if (answer.equalsIgnoreCase("Y")) {
			saveBook();
		}
		addressBook = null;
	}

	public void addressBook() throws IOException {
		addressBook = new AddressBook();
		do {
			System.out.println("Enter choice");
			System.out.println(
					"1:Add Person \n 2:Edit Person \n 3:Display Persons \n 4:Delete Person \n 5:Sort \n 6:Go Back to main ");
			int choice =sc.nextInt();
			switch (choice) {
			case 1:

				
				addressBook.addPerson();

				break;
			case 2:

			
				addressBook.editPerson();

				break;
			case 3:

				addressBook.display();

				break;
			case 4:

			
				addressBook.deletePerson();

				break;
			case 5:

			
				sort();

				break;
			case 6:

		
				AddressBookApp.main(null);

			default:
				System.out.println("Invalid choice");
				break;
			}
		} while (addressBook != null);
	}

	
	
	public void sort() {
		System.out.println("Enter your choice");
		System.out.println("1:Sort by Last Name  2:Sort by Zip Code");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Sorting by last name");

		
			addressBook.sortByLastName();

			System.out.println("Your list is sorted");
			break;
		case 2:
			System.out.println("Sorting by zip code");
									
		
			addressBook.sortByZipCode();

			System.out.println("Your list is sorted");
			break;
		default:
			System.out.println("Invalid choice");
			break;		
		}
	}
}
