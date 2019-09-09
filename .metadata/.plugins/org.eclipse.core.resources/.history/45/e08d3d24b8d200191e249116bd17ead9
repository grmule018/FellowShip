/******************************************************************************
 *  Purpose: This application is to manage stocks
 ******************************************************************************/
package com.bridglabz.oops;

import java.io.IOException;

import com.bridglabz.utility.*;;

/*
* The main function is written to take input from the user and
* calls various methods that manages the stocks
*/
public class StockPortfolioApplication {
	public static void main(String[] args) throws IOException {
		int flag=0;
		do {
			System.out.println("Enter-- 1:Add Stock  2:Calculate each stock value  3:Calculate value of total stocks  4:Display  5:Quit");
			int choice = Utility.integerInput();
			switch (choice) {
			case 1:
			
				StockPortfolio.addStock();
				
				break;
			case 2:
				
				
				StockPortfolio.valueOfEachShare();
				
				break;
			case 3:
				
				
				StockPortfolio.valueOfTotalStocks();
				
				break;
			case 4:
				
				
				StockPortfolio.displayStockDetails();
			
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}while(flag<1);
	}
}
