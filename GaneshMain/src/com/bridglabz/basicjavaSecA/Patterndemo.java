package com.bridglabz.basicjavaSecA;

public class Patterndemo {

	public static void main(String[] args) {

        for (int i=1;i<=3;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		if(j%2==0&&i!=2||i==2&&j%2!=0)		
               {
        		System.out.print(" *");
               }
        		else
        		{
        			System.out.print("  ");
        		}
        	}
        	System.out.println();
        }
        System.out.println();
	}

}
/**
 * i==1&&j<=6&&j!=1&&j!=3&&j!=5
        		 ||i==2&&j<=6&&j!=2&&j!=4 
        		 ||i==3&&j<=6&&j!=1&&j!=3&&j!=5
*/