package com.digite.stock;


public final class StockSingleton {
	
	
	private StockSingleton() {
		
	}
	private static Stock stock;
	
	public static void getStock() {
		if(stock==null) {
			stock=new Stock();
			
		//return stock;
		}
		
	}

}
