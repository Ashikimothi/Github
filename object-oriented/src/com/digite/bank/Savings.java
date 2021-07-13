package com.digite.bank;


public class Savings extends Accounts{
	
//	public Savings() {
//	
//	}
	public Savings(String holder) {
		super(holder, MIN_SAVING_BALANCE);
	}

	@Override
	public void withdraw(double amount) {
		if( amount< (balance - MIN_SAVING_BALANCE)) {
			balance-=amount;
		txns.add(new Transaction("Dr",amount,balance));
		}else
			System.out.println("Insufficient balance!");
	}
	

}
