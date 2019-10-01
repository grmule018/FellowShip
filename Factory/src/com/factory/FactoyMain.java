package com.factory;
import java.util.Scanner;
import com.phone.OS;
import com.phone.OperationFactory;

public class FactoyMain
{
	
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
//		OS obj=new Android();
//		obj.spec();
	
		OperationFactory osf=new OperationFactory();
		System.out.println("Enter OS name\n1.Android\n2.Ios\n3.Windows");
		String str= sc.next();
		OS obj=osf.getInstance(str);
		obj.spec();
	}
} 


