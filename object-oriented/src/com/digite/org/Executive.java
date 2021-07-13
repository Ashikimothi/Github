package com.digite.org;


public class Executive extends Employee {
private double incentive;
	public Executive() {
		// TODO Auto-generated constructor stub
	}

	public Executive(String empName, int salary, double incentive) {
		super(empName, salary);
		this.incentive=incentive;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double  getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + incentive;
	}

	@Override
	public void paySlip() {
		// TODO Auto-generated method stub
		super.paySlip();
		System.out.println("Incentive " + incentive);
	}

}