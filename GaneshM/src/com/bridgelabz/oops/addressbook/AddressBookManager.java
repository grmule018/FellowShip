//  Purpose: The program is to maintain an address books



package com.bridgelabz.oops.addressbook;
import java.util.Collections;

import java.util.Optional;


import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.utility.*;


public class AddressBookManager {

	public Scanner sc=new Scanner(System.in);
	
	static String charbook;
	
	private AddressBook addressBook = null;

	static List<Person> listOfPersons = new ArrayList<Person>();

	
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
		charbook = sc.next();
		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (charbook.equals(filename)) {
				if (file.length() > 0) {
					
					String string = OopsUtility.readJsonFile(filename);
					listOfPersons = OopsUtility.userReadValue(string, AddressBook.class);
					System.out.println("Address book is not empty");
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
		//addressBook = null;
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

	
	class AddressBook {
			
					
		ObjectMapper objectMapper = new ObjectMapper();
		
		 	public void addPerson() throws JsonGenerationException, JsonMappingException, IOException {
			Person person = new Person();
			System.out.println("Enter first name");
			person.setFirstName(sc.next());
			System.out.println("Enter last name");
			person.setLastName(sc.next());
			System.out.println("Enter contact number");
			person.setContactNo(sc.nextLong());

			// Function call to add the address details of the person
			
			person.setAddress(addressDetails());
			listOfPersons.add(person);
			objectMapper.writeValue(new File("/home/user/Downloads/RELEASE/GaneshM/ganesh.json"), listOfPersons);
		}

		public Address addressDetails() {
			Address address = new Address();
			System.out.println("Enter street");
			address.setStreet(sc.next());
			System.out.println("Enter city");
			address.setCity(sc.next());
			System.out.println("Enter state");
			address.setState(sc.next());
			System.out.println("Enter zipcode");
			address.setZipcode(sc.nextLong());
			return address;
		}

		public void editPerson() {
			System.out.println("Enter the details of the person whose information needs to be modified");
			System.out.println("Enter first name");
			String firstName = sc.next();
			System.out.println("Enter last name");
			String lastName = sc.next();
			Optional<Person> optional = listOfPersons.parallelStream()
					.filter(person -> firstName.equals(person.getFirstName()) && lastName.equals(person.getLastName()))
					.findAny();
			if (optional.isPresent())
				editUpdate(optional.get());
			else
				System.out.println("Person of that name is not present");
		}

		public void editUpdate(Person per) {
			do {
				System.out.println("Enter the choice you want modify");
				System.out.println("1:Contact Number  2:Address");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the new contact number");
					long newContact = sc.nextLong();
					per.setContactNo(newContact);
					System.out.println("Your contact number is updated");
					break;
				case 2:
					Address address = per.getAddress();

					// Function call to modify the address details of the specified person
					addressUpdate(address);

					per.setAddress(address);
					break;
				default:
					System.out.println("Invalid choice");
					System.exit(0);
				}
			} while (per != null);
		}

		public void addressUpdate(Address address) {
			do {
				System.out.println("Enter the details of address you want to change");
				System.out.println("1:Street  2:City  3:State  4:Zipcode");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter the street");
					String newStreet = sc.next();
					address.setStreet(newStreet);
					System.out.println("Your street is updated");
					break;
				case 2:
					System.out.println("Enter the city");
					String newCity = sc.next();
					address.setCity(newCity);
					System.out.println("Your city is updated");
					break;
				case 3:
					System.out.println("Enter the state");
					String newState = sc.next();
					address.setState(newState);
					System.out.println("Your state is updated");
					break;
				case 4:
					System.out.println("Enter the zipcode");
					long newZip = sc.nextLong();
					address.setZipcode(newZip);
					System.out.println("Your zip code has been updated");
					break;
				default:
					System.out.println("Invalid choice");
					System.exit(0);
				}
			} while (address != null);
		}

		public void display() {
		listOfPersons.forEach(person->{
				System.out.println("First Name: " + person.getFirstName());
				System.out.println("Last Name: " + person.getLastName());
				System.out.println("Contact Number: " + person.getContactNo());
				Address add = person.getAddress();
				System.out.println("Street: " + add.getStreet());
				System.out.println("City: " + add.getCity());
				System.out.println("State: " + add.getState());
				System.out.println("Zip code: " + add.getZipcode());
				System.out.println("-------------------------------------");
			});
		}


		public void deletePerson() {
			System.out.println("Enter the details of person to delete");
			System.out.println("Enter first name");
			String firstName = sc.next();
			System.out.println("Enter last name");
			String lastName = sc.next();
			if (!listOfPersons.isEmpty()) {
				boolean isRemoved = listOfPersons.removeIf(
						person -> firstName.equals(person.getFirstName()) && lastName.equals(person.getLastName()));
				if (isRemoved)
					System.out.println("The person has been deleted");
				else
					System.out.println("The person of that name does'nt exist");
			} else
				System.out.println("Address Book is empty!");
		}

		public void sortByLastName() {
			Collections.sort(listOfPersons, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));
		}

		/**
		 * Function to sort the persons in the specified address book by zip code
		 */
		public void sortByZipCode() {
			Collections.sort(listOfPersons,
					(person1, person2) -> person1.getAddress().getZipcode() > person2.getAddress().getZipcode() ? 1
							: person1.getAddress().getZipcode() < person2.getAddress().getZipcode() ? -1
									: person1.getAddress().getZipcode() == person2.getAddress().getZipcode() ? 0 : -10);

		}
	}
	}

