package com.bridgelabz.oops.commercial;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.OopsUtility;

public class CommercialApp {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{	Scanner sc =new Scanner(System.in);
		Person1 person = new Person1();
		Company company= new Company();
		ObjectMapper mapper=new ObjectMapper();
		File personFile=new File("/home/user/Downloads/RELEASE/GaneshM/src/com/bridgelabz/oops/commercial/Person.json");
		File companyFile=new File("/home/user/Downloads/RELEASE/GaneshM/src/com/bridgelabz/oops/commercial/Company.json");
		
		List<Person1> personList=mapper.readValue(personFile, new TypeReference <List <Person1> >(){ });
		
		List<Company> companyList=mapper.readValue(companyFile, new TypeReference <List <Company> >(){ });
		int choice=0;
		do
		{
			
			System.out.println("Press \n1.Buy Share\n2.Sell Share\n3.Print Report\n4.Exit");
			choice=sc.nextInt();
			
			
			switch (choice)
			{
			case 1:
				System.out.println("Enter index of person");
				int indexPerson=sc.nextInt();
				person=personList.get(indexPerson);
				System.out.println(person.toString());
				
				System.out.println("Enter index of company");
				int indexCompany=sc.nextInt();
				company=companyList.get(indexCompany);
				System.out.println(company.toString());
				
				System.out.println("Enter how many share to buy : ");
				int numberOfShares=sc.nextInt();	
				
				if(numberOfShares>company.getNumberOfShares())
				{
					System.out.println("Sorry you cant buy shares");
				}
				else
				{
					//call buyshare method to buy share
					int amount=CommercialOperations.buyShares(person.getBalance(), numberOfShares, company.getShareAmount());
					int availableSharesInCompany=company.getNumberOfShares();
					availableSharesInCompany=availableSharesInCompany-numberOfShares;
					company.setNumberOfShares(availableSharesInCompany);
					person.setBalance(amount);
					
					int availableShareInPerson=person.getNumberOfShares();
					availableShareInPerson=availableShareInPerson-numberOfShares;
					person.setNumberOfShares(availableShareInPerson);	
					
				}
				break;
			case 2:
				System.out.println("Enter index of person");
				int indexPerson2=sc.nextInt();
				person=personList.get(indexPerson2);
				System.out.println(person.toString());
				
				System.out.println("Enter index of company");
				int indexCompany2=sc.nextInt();
				company=companyList.get(indexCompany2);
				System.out.println(company.toString());
				
				System.out.println("Enter how many share to sell : ");
				int numberOfShares2=sc.nextInt();	
				if(numberOfShares2>company.getNumberOfShares())
				{
					System.out.println("Sorry you cant buy shares");
				}
				else
				{
					//call sellshare method to buy share
					int amount2=CommercialOperations.sellShares(person.getBalance(), numberOfShares2, company.getShareAmount());
					int availableSharesInCompany=company.getNumberOfShares();
					availableSharesInCompany=availableSharesInCompany-numberOfShares2;
					person.setBalance(amount2);
					
					int availableShareInPerson=person.getNumberOfShares();
					availableShareInPerson=availableShareInPerson+numberOfShares2;
					person.setNumberOfShares(availableShareInPerson);	
				}
				break;
			case 3:
				OopsUtility.writeObjectToJson(personList, "Person.json");
				System.out.println(personList);
				
				OopsUtility.writeObjectToJson(companyList, "Company.json");
				System.out.println(companyList);
				break;
			case 4:
				System.exit(0);
				default:
					System.out.println("Wrong Input");
			}
		}while(choice<5);
			
	}

}
