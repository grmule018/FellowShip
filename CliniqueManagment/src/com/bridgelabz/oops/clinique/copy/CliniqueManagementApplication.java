
package com.bridgelabz.oops.clinique.copy;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class CliniqueManagementApplication {
	
		static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) throws IOException, JsonMappingException, JsonParseException {
		int n=0;
		do {
			System.out.println("Enter the choice");
			System.out.println("1:Add\n2:Search\n3:Take Appointment\n4:Famous Doctor\n5:Famous Specialization\n6:Quit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				
				CliniqueManager.add();
				
				break;
			case 2:
				CliniqueManager.search();
				
				break;
			case 3:
	
				CliniqueManager.takeAppointment();
				
				break;
			case 4:
				
				CliniqueManager.famousDoctor();
				
				break;
			case 5:
				
				CliniqueManager.famousSpecialist();
				
				break;
			default:
				System.out.println("Invalid choice");
				System.exit(0);
			}
		}while(n<1);
	}
}
