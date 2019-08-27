package com.bridglabz.basicjavaSecA;

public class FactorialUsingRecurssion {
	public static void main(String[] args) {
		
		int no =5;
//		FactorialUsingRecurssion  f=new FactorialUsingRecurssion ();
//		int nn = f.calcFact(no);
//		
		System.out.println("the value is ");
	}
	
		public int calcFact(int no)
		{
			int fact=1;
			if (no>1)
			{
				fact=fact*no;
				calcFact(no-1);
			}
			return fact;
	}
	

}
