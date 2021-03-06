/*************************************************************
 * Purpose: Inventory management main 
 * 
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 ****************************************************************/	
package com.bridgelabz.oops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.utility.*;

 public class InventoryManagement4 {
	public static Scanner sc=new Scanner(System.in);
	/*
	* The main function is written to take input from the user and
	* performs read and write operation from the json file 
	*/
	
	public static void main(String[] args) throws IOException {
	
	
		
		List<InventoryList4> list = new ArrayList<InventoryList4>();
		List<Inventory4> listin = new ArrayList<Inventory4>();
		Inventory4 inventory = new Inventory4();
		String filename = "/home/user/Downloads/RELEASE/GaneshM/src/com/bridgelabz/oops/inventory4.json";
		String str = OopsUtility.readJsonFile(filename);
		int count = 10;
		do {
			System.out.println("Enter the choice");
			System.out.println("1:Read and Display\n2:Add and Write\n3:Calculate the total price\n4:Quit");
			int choice =sc.nextInt();
			switch (choice) {
			
			case 1:
				try {
					list = OopsUtility.userReadValue(str, InventoryList4.class);
					for (int i = 0; i < list.size(); i++) {
						InventoryList4 inList = list.get(i);
						System.out.println("Inventory name: " + inList.getInventoryName());
						for (int j = 0; j < inList.getListofInventories().size(); j++) {
							System.out.println("Name: " + inList.getListofInventories().get(j).getName());
							System.out.println("Weight: " + inList.getListofInventories().get(j).getWeight());
							System.out.println("Price: " + inList.getListofInventories().get(j).getPrice());
							
						}
						System.out.println("---------------------------------------------------------------");
					}
				} catch (Exception e) {
					System.out.println("Enter data");
				}
				break;
			
			case 2:
				int flag = 1;
				int flag1=0;
				try {
					list = OopsUtility.userReadValue(str, InventoryList4.class);
					while (flag == 1) {
						System.out.println("Enter the inventory name: ");
						String inName =sc.nextLine();
						if (!list.isEmpty())
						{
							for (InventoryList4 in : list)
							{
								if (inName.equals(in.getInventoryName()))
								{
									listin = in.getListofInventories();
									
						//Method 1- using non-static function of Utility class
						//of com.bridgelabz.util package
									inventory = insertData();
									
									listin.add(inventory);
									flag1=1;
								}
							}
						}
						if (list.isEmpty()||flag1==0) {
						inventory = insertData();
						listin.add(inventory);
					}
						System.out.println("Do you want to add more? if yes press 1 else 0");
						flag = sc.nextInt();
					}
						System.out.println("The entered element is added to the list");
						String json = OopsUtility.userWriteValueAsString(list);
						OopsUtility.writeFile(json, filename);
						System.out.println("Inventory list has been written on to file");
				} 
				
				catch (Exception e) {
					System.out.println("File is empty!");
				}
				break;
				
			case 3: 
				try{
					list = OopsUtility.userReadValue(str, InventoryList4.class);
						
						//Method 2- using non-static function of Utility class
						OopsUtility.calulatePrice(list);
						
				}catch(Exception e){
					System.out.println("File is empty!");
					}
			
			case 4:
				System.exit(0);
			}
			count--;
		} while (count != 0);
	}
 	// Function to insert data in inventory 
	
	public static Inventory4 insertData() {
	
		Inventory4 inventory = new Inventory4();
		System.out.println("Enter the name:");
		inventory.setName(sc.nextLine());
		System.out.println("Enter the weight");
		inventory.setWeight(sc.nextFloat());                  
		System.out.println("Enter the price");
		inventory.setPrice(sc.nextDouble());
		return inventory;
	}

}
