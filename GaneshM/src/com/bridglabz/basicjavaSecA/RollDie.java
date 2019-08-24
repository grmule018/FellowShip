package com.bridglabz.basicjavaSecA;
import java.util.Scanner;

import com.bridglabz.utility.Utility;

public class RollDie {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int times;
		System.out.println("please enter times to throw a die");
		times=scanner.nextInt();
		Utility.RollDie(times);
		scanner.close();
	}

}


