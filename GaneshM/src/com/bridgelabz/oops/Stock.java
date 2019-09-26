/**
 * Purpose: Creates a plain old java object to achieve encapsulation and for
 *  		 reuse ability of the code 
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 09-09-2019
 **/
 
package com.bridgelabz.oops;

public class Stock {
	
	private String stockName;
	private int noOfShares;
	private float sharePrice;
	//Crating getter setter methods
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
 		this.stockName = stockName;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public float getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(float sharePrice) {
		this.sharePrice = sharePrice;
	}
}
