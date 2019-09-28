/**
 * Purpose: Contains all the functions for the .java files in 
 * 
 * @author Ganesh Mule
 * @version 1.0
 **/
package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;

public class OopsUtility {
	static Scanner sc=new Scanner(System.in);
	private static ObjectMapper objectMapper = new ObjectMapper();
	
	// Static Function to map the json string to the list of objects
	
	public static <T> List<T> userReadValue(String str, Class<?> cls)
			throws JsonParseException, JsonMappingException, IOException {
		CollectionType colletion = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, cls);
		return objectMapper.readValue(str, colletion);
	}
		
	// Static Function to map the list to json strings
	 
	public static <T> String userWriteValueAsString(List<T> list)
			throws JsonGenerationException, JsonMappingException, IOException {
		return objectMapper.writeValueAsString(list);
	}
	
	//  Generic Function to write file
	
	public static <T> void writeToFile(String filename,List<T> list) 
			throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println(filename);
		String jsonString = userWriteValueAsString(list);
		writeFile(jsonString, filename);
	
	}
	// Function to write on to json file
	 
	public static void writeFile(String json, String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json);
		bw.close();
	}
	

	// Function to read the json file
	 
	public static String readJsonFile(String filename) throws IOException {
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		String line = "";
		while ((line = br.readLine()) != null) {
			str = str + line;
		}
		br.close();
		return str;
	}

}
