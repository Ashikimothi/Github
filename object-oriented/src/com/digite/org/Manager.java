package com.digite.org;


public class Manager extends Employee {
private double comm;
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String empName, int salary, double comm) {
		super(empName, salary);
		this.comm=comm;
		// TODO Auto-generated constructor stub
	}

	//overriding methods of super class
	@Override
	public double  getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + comm;
	}

	@Override
	public void paySlip() {
		// TODO Auto-generated method stub
		super.paySlip();
		System.out.println("Commision " + comm);
	}

}
