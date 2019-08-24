/**
 * Simulate Stopwatch Program
 * Desc -> Write a Stopwatch Program for measuring the time that elapses between the start and end clicks
 * I/P -> Start the Stopwatch and End the Stopwatch
 * Logic -> Measure the elapsed time between start and end
 * O/P -> Print the elapsed time.
 */

package com.bridglabz.functional;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Stopwatch_13 {
	
	public static void main(String[] args) throws Exception {
		System.out.println("The Stopwatch Program ");
		Scanner sc=new Scanner(System.in);
		
		Date date = new Date();
	    String strDateFormat = "hh:mm:ss a";
	    String strDateFormat1 = "ss";
	    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
	    DateFormat dateFormat1 = new SimpleDateFormat(strDateFormat1);
	    String formattedDate= dateFormat.format(date);
	    String formattedDate_sec_start= dateFormat1.format(date);
		
		//for start stopwatch
		
		System.out.println("Press Enter key to Start Stopwatch  at :");
		String check1 =sc.nextLine();
		
		System.out.println("The Start Timing :"+formattedDate);
		
		//for stop stopwatch
		
		System.out.println("Press Enter key to stop Stopwatch :");
		String check =sc.nextLine();
		
		date = new Date();
	    strDateFormat = "hh:mm:ss a";
	    dateFormat = new SimpleDateFormat(strDateFormat);
	    dateFormat1 = new SimpleDateFormat("ss");
	    formattedDate= dateFormat.format(date);
	    String formattedDate_sec_end= dateFormat1.format(date);
	    
	    int end = Integer.parseInt(formattedDate_sec_end);
	    int start = Integer.parseInt(formattedDate_sec_start);
		
		System.out.println("The End Timing :"+formattedDate);
		
		int diff =(end-start),diff1=0;
		
		if(diff > 0)
		{
			diff1 = diff;
		}else {
			diff1=60 - diff;
		}
		
		System.out.println("The Elapsed Time :"+diff1+" Second");
				
	}

}

/*
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	e.printStackTrace();
}

*/