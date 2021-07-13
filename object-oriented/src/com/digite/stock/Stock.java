package com.digite.stock;

/**
 * this class represents a stock of any random company
 * @author ALKA KIMOTHI
 *
 */
public class Stock implements Holder, Broker, Exchange {
	/** Method to see the current  quote of stock
	 * 
	 */
	public void viewQuote() {
		System.out.println("View Quote");
	}
	
	public void getQuote() {
		System.out.println("Get Quote");
	}
	public void setQuote() {
		System.out.println("Set Quote");
	}

}
