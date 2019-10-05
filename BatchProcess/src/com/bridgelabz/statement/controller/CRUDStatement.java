/******************************************************************************
 
 *  Purpose: program to perform CURD operation using  statement
 *  @author  
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.statement.controller;

import java.util.Scanner;

import com.bridgelabz.statement.model.Collage;

import com.bridgelabz.statement.service.ImplStatement;



public class CRUDStatement {

	public static void main(String[] args) throws Exception {
		ImplStatement table = new ImplStatement();
		Scanner scanner = new Scanner(System.in);
		Collage collage = new Collage();
		boolean exit = true;
		while (exit) {
	
			System.out.println("Enter your choice\n1.Insert into table \n2.Read table \n3.Update table "
					+ "\n4.Delete \n5.Exit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Collage id  : ");
				collage.setId(scanner.nextInt());
				System.out.println("Enter Collage name : ");
				collage.setName(scanner.next());
				System.out.println("Enter Collage address  : ");
				collage.setAddress(scanner.next());
				table.createTable(collage);
				System.out.println("value inserted created succesfully ");
				break;

			case 2:

				table.showTable();
				break;

			case 3:
				table.showTable();
				System.out.println("Enter id which you want to perform updation ");
				int id = scanner.nextInt();
				System.out.println("Enter name to change: ");
				collage.setName(scanner.next());
				System.out.println("Enter address to change: ");
				collage.setAddress(scanner.next());

				table.update(id, collage);

				table.showTable();
				break;

			case 4:
				table.showTable();
				System.out.println("Enter id which you want to delete ");
				int deleteId = scanner.nextInt();
				table.delete(deleteId);
				table.showTable();

				break;
			case 5:
				exit = false;

			}

		}
		scanner.close();
	}

}
