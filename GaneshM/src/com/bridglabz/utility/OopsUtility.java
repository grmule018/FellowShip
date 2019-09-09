/******************************************************************************
 *  
 *  Purpose: Contains all the functions for the .java files in 
 *  		 com.bridgelabz.oops package
 
 ******************************************************************************/

package com.bridglabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;

import com.bridglabz.oops.Inventory4;
import com.bridglabz.oops.InventoryList4;

public class OopsUtility {

	private static ObjectMapper objectMapper = new ObjectMapper();
	/**
	 * Static Function to map the json string to the list of objects
	 */
	public static <T> List<T> userReadValue(String str, Class<?> cls)
			throws JsonParseException, JsonMappingException, IOException {
		CollectionType colletion = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, cls);
		return objectMapper.readValue(str, colletion);
	}

	/**
	 * Static Function to map the list to json string
	 */
	public static <T> String userWriteValueAsString(List<T> list)
			throws JsonGenerationException, JsonMappingException, IOException {
		return objectMapper.writeValueAsString(list);
	}

	/**
	 * Function to read the json file
	 */
	public static String readJsonFile(String filename) throws IOException {
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		String line = "";
		while ((line = br.readLine()) != null) {
			str += line;
		}
		br.close();
		return str;
	}
	
	/**
	 * Function to write on to file
	 */
	public static void writeFile(String json, String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json);
		bw.close();
	}
	
	public static <T> void writeToFile(String filename,List<T> list) throws JsonGenerationException, JsonMappingException, IOException {
		String jsonString = userWriteValueAsString(list);
		writeFile(jsonString, filename);
	}
	 /** Function to insert data in inventory 
	 * @return Inventory the object of Inventory class
	 **/
	public static Inventory4 insertData() {
		Inventory4 inventory = new Inventory4();
		System.out.println("Enter the name:");
		inventory.setName(Utility.StringInput());
		System.out.println("Enter the weight");
		inventory.setWeight(Utility.floatInput());                  
		System.out.println("Enter the price");
		inventory.setPrice(Utility.doubleInput());
		return inventory;
	}

	/**
	 * Function to calculate the price of each inventory
	 *  
	 * @param list the list of inventories
	 */
	public static void calulatePrice(List<InventoryList4> list) {
		double eachInventoryValue;
		for (int i = 0; i < list.size(); i++) {
			InventoryList4 inList = list.get(i);
			System.out.println("Inventory name :" + inList.getInventoryName());
			for (int j = 0; j < inList.getListofInventories().size(); j++) {
				eachInventoryValue = (inList.getListofInventories().get(j).getPrice())
						* (inList.getListofInventories().get(j).getWeight());
				System.out.println("total price:" + eachInventoryValue);
			}
			System.out.println("---------------------------------------------");
		}
	}
	
}