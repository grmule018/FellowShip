package com.bridglabz.basicjavaSecA;
import com.bridglabz.utility.Utility;
public class BinarySearchForIntger {

	public static void main(String[] args) {
			
		int []arr= {2,5,6,8,9,4,3,66,55,77};
		System.out.println("Enter element you want to search");
		int element=Utility.integerInput();
		Utility.BinarySearchForIntger(element,arr);
	}
}
