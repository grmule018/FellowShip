/******************************************************************************
 *  Compilation:  javac -d bin StopWatch.java
 *  Execution:    java -cp bin com.bridgelabz.functional.StopWatch 
 *  
 *  Purpose: Write a Stopwatch Program for measuring the time that elapses between
 *  		 the start and end clicks
 *
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019 
 *   ******************************************************************************/

package com.bridgelabz.functional;

//import com.bridgelabz.utility.FunctionalUtility;

public class StopWatch {
	
	/*
	* The main function is written to take input from the user and
	* call stopWatch function that measures elapsed time
	*/

			public long startTimer=0;
			public long stopTimer=0;
			public long elapsed;
			
			//to start timer
			public void start()
			{
				startTimer=System.currentTimeMillis();
				System.out.println("Start Time is: "+startTimer);
			}
			
			// to stop timer
			public void stop()
			{
				stopTimer=System.currentTimeMillis();
				System.out.println("Stop Time is: "+stopTimer);
			}
			
			public long getElapsedTime()
			{
				elapsed=stopTimer-startTimer;
				return elapsed;
			}
			
			public static void main(String[] args) //throws Exception
			{
				StopWatch sw=new StopWatch();
				System.out.println("Press '1' to Start Time: ");
				com.bridgelabz.utility.FunctionalUtility.userInt();
				sw.start();

				System.out.println();
				System.out.println("Press '2' to Stop Time: ");
				com.bridgelabz.utility.FunctionalUtility.userInt();
				sw.stop();

				long l=sw.getElapsedTime();
				System.out.println();
				System.out.println("Total Time Elapsed(in millisec) is:"+l);
				System.out.println();
				System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
			}
		}

