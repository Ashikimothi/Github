package com.digite.bank;


public interface Bank {
	
	public static final int INIT_ACCOUNT_NO=11001;
	public static final double MIN_SAVING_BALANCE =1000;
	public static final double INIT_CURRENT_BALANCE=5000;
	public static final double MIN_CURRENT_BALANCE=0;
	public static final double OVERDRAFT_LIMIT=10000;
	
	void deposit(double amount);
	void withdraw(double amount);
	void statement();
	double getBalance();

}
