/**
 * Purpose: json utility for read and write value .
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 06-09-2019
 **/
package com.bridgelabz.utility;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtility {
	
		public static  ObjectMapper mapper=new ObjectMapper();
	
//Converting java into json
	
public static String convertJavaToJson( Object object) {
	String jsonResult="";
	try {
		jsonResult=mapper.writeValueAsString(object);
	} 
	catch (JsonGenerationException e) {
		
		System.out.println("Excepetion ocuured while converting java object into json"+e.getMessage());
		
	}
	catch (JsonMappingException e) {
	
		System.out.println("Excepetion ocuured while converting java object into json"+e.getMessage());
		
	}
	catch (IOException e) {
		
		System.out.println("Excepetion ocuured while converting java object into json"+e.getMessage());	
	}
return jsonResult;
}
//converting json to java

public static <T> T convertJsonToJava(String jsonString,Class<T>cls) {
	T result=null;
	try {
		result=mapper.readValue(jsonString,cls);
	}
	catch (JsonParseException e) {
		System.out.println("exception Occured while converting json into java"+e.getMessage());
		
	} 
	catch (JsonMappingException e) {
		System.out.println("exception Occured while converting json into java"+e.getMessage());	
	}
	catch (IOException e) {
		System.out.println("exception Occured while converting json into java"+e.getMessage());
	}
	return result;
	}
}
