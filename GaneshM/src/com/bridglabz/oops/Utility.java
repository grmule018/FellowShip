package com.bridglabz.oops;
/*
*  Purpose: Putting Commonly used function in single file.
	1 function to take word,integer and double as input
	2: function to read and write file.
	3 function to match regex from string and replace with user details	 
**/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.bridglabz.oops.UserDetails;

import java.io.File;
import java.io.FileWriter;

public class Utility
{
	BufferedReader br;
	private final String REGEX_NAME = "<<name>>";
	private final String REGEX_FULLNAME = "<<full name>> ";
	private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final String REGEX_DATE = "12/06/2016";
	
	//constructor to initialize bufferedReader
	public Utility(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	//Regex pattern matcher match the string and replace the regex pattern with user details.
	public String convertString(UserDetails userDetails,String message){
		Pattern p = Pattern.compile(REGEX_NAME);
		Matcher m = p.matcher(message); 
		message = m.replaceAll(userDetails.getfName());

		p = Pattern.compile(REGEX_FULLNAME);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.getfName()+" "+userDetails.getlName());

		p = Pattern.compile(REGEX_MOBILE_NO);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.mobileNo());

		p = Pattern.compile(REGEX_DATE);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.date());

		return message;
	}
	
	//take input word
	public String inputString(){
		try{
			return br.readLine();
		}
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return "";
	}

	//Take Integer Input
	public int inputInteger(){
		try{
			try{	
				return Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException nfe){
				System.out.println(nfe.getMessage());	
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return 0;
	}

	//Take Double Input
	public double inputDouble(){
		try{
			try{	
				return Double.parseDouble(br.readLine());
			}
			catch(NumberFormatException nfe){
				System.out.println(nfe.getMessage());	
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return 0.0;
	}
	

	//Function take String in dd/mm/yyyy format and return Date Object
	public Date printDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try{
			return sdf.parse(date);
		}
		catch(ParseException pe){
			return null;
		}
	}

	//format date object in this format 
	public String getFormatedDate(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(date);
	}

	//Take file name as input and return string of file text
	public String getFileText(String fileName){
		try{
			br=new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null){
				sb.append(line);
				sb.append(System.lineSeparator());
				line=br.readLine();
			}
			return sb.toString();
		 }
		catch(Exception e){
			return null;
		}
		finally{
			try{
				br.close();
			}
			catch(IOException ioe){
			}	
		}
	}
	
	//this function take two parameter 
	// 1 what data to write.
	// 2 file name
	public void writeToFile(String data,String fileName)throws Exception{
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file); 
		// Writes the content to the file
		writer.write(data); 
		writer.flush();
		writer.close();
	}
}