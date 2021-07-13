package com.digite.bank;

import java.util.ArrayList;

public abstract class Accounts implements Bank {
	
	private int acntNo;
	private String holder;
	protected double balance;
//	protected Transaction[] txns;
//	protected int index;
	protected ArrayList<Transaction> txns;

	public static final int INIT_ACCOUNT_NO=11001;
	public static final double MIN_SAVING_BALANCE =1000;
	public static final double INIT_CURRENT_BALANCE=5000;
	public static final double MIN_CURRENT_BALANCE=0;
	public static final double OVERDRAFT_LIMIT=10000;
	private static int counter =INIT_ACCOUNT_NO;
	
	
//	public Accounts(int acntNo, String holder, double balance) {
//		super();
//		this.acntNo = counter++;
//		this.holder = holder;
//		this.balance = balance;
//	}
	public Accounts() {}
	
	
	public Accounts(String holder,double balance) {
		this.acntNo = counter++;
		this.holder=holder;
		this.balance=balance;	
		
//		
//		txns = new Transaction[10];
//		txns[index ++]=new Transaction("OB", balance, balance);
		
		txns=new ArrayList<Transaction>();
		txns.add(new Transaction("OB",balance,balance));
	}
	
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance+=amount;
		//txns[index++] = new Transaction("Cr", amount, balance);
		txns.add(new Transaction("cr",amount,balance));
	}
	
	//public abstract void withdraw(double amount);
	
	public void statement() {
		System.out.println("Statement of A/C :"+ acntNo);
		System.out.println("Type\tAmount\tBalance");
		
//		for (int i = 0; i < index; i++) {
//			
//			txns[i].print();
		for(Transaction t:txns)
			t.print();
			
		
	}
	
	
	

}
