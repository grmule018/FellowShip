package com.bridglabz.basicjavaSecA;

import com.bridglabz.utility.Utility;

public class MagicMatrix {

	public static void main(String[] args)
	{
		int[][] matrix=new int[3][3];
		System.out.println("Enter elements in array");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				 matrix[i][j]=Utility.integerInput();
			}
		}   
		int sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(i==0)
				{
					sum2+=matrix[i][j];
					sum5+=matrix[j][i];
				}
				if(i==1)
				{ 
					 sum3+=matrix[i][j];
					 sum6+=matrix[j][i];
				}
				if(i==2)
				{
					 sum4+=matrix[i][j];
					 sum7+=matrix[j][i];
				}
				if(i==0&&j==0||i==1&&j==1||i==2&&j==2)
				{
					 sum8+=matrix[i][j];
				}
				if(i==0&&j==2||i==1&&j==1||i==2&&j==0)
				{
					 sum9+=matrix[i][j];
				}
			}
		
		}
		
		int row_total=sum2+sum3+sum4;
		int column_total=sum5+sum6+sum7;
		
		if(row_total==column_total && sum8==sum9)
		{
			System.out.println("Magic square");
		}
		else
		{
			System.out.println("Not a Magic square");
		}
		
	

}
}
