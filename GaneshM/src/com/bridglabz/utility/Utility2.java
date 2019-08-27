package com.bridglabz.utility;

public class Utility2 {

	public static void CollinearUsingSlop(int x1, int x2, int x3, int y1, int y2, int y3) {
		int slope_AB,slope_BC, slope_AC;
		slope_AB=(y2-y1)/(x2-x1);
		slope_BC=(y3-y2)/(x3-x2);
		slope_AC=(y3-y1)/(x3-x1);
		if(slope_AB==slope_BC&&slope_AC==slope_AB&&slope_BC==slope_AC) 
		{
		 System.out.println("Slope formed by using slope formula "+
		" Slope of three point is equl hence this points are collinear");
		}
		else{System.out.println("it is not collinear");
}
	}
	public static void CollinearUsingArea(int x1, int x2, int x3, int y1, int y2, int y3)
	{
		int a=x1-x2;
		int b=x2-x3;
		int c=y1-y2;
		int d=y2-y3;
		int determinant=a*d-b*c;
		
		int AreaofTriangle=1/2*determinant;
		if (AreaofTriangle==0) 
		{
			System.out.println("Area of triangle formed by three points are 0="
					+ "hence these are collinear points");
			
		}
		System.out.println("Not Collinear points");		
	}
public static void PresentValues(double investC, double year, double rate) {
		double PresentValues = investC/  Math.pow(1+(rate/100), year);
	    
	    System.out.println("Present Values payments = " + PresentValues);
}
public static void FutureValues(double investC, double year, double rate) {
	
	double futurevalue = investC*  Math.pow(1+(rate/100), year);
    
    System.out.println("Future Value payments = " + futurevalue);
    
}
public static void Largest(int[] arr) {
	int first;
	first=Integer.MIN_VALUE;
	for (int i=0; i<arr.length; i++){
		if (arr[i] > first) {
			first=arr[i];
			}
		else if (arr [i]>= first)
			first = arr[i];
	}	
	System.out.println("The largest element is ="+ first);
}

public static void Smallest(int[] arr) {
	int first;
	first=Integer.MAX_VALUE;
	for(int i=0; i<arr.length;i++)
	if(arr[i]< first) {
		first=arr[i];}
	else if(arr[i]<= first) {
		first=arr[i];
	}
	System.out.println("The smallest element is="+ first);
	
}
}
