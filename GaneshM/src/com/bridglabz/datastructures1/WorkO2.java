package com.bridglabz.datastructures1;

import com.bridglabz.datastructures1.WorkO;

public class WorkO2 {
	
	public static void main(String[]args) {
		
		WorkO oreder=new WorkO();
	{
		
		oreder.add(20);
		oreder.add(22);
		oreder.add(13);
		oreder.add(26);
		oreder.add(15);
		oreder.add(29);
		System.out.println("Unsorted ");
		oreder.display();
		oreder.sort();
		System.out.println("Sorted");
		oreder.display();
	}
	}
}