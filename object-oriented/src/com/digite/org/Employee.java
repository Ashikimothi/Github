package com.digite.org;


public class Employee {
	private int empNo;
	private String empName;
	private int salary;

	private static int counter;

	public Employee() {
 	}

	static {
		System.out.println("Emp Class loaded...");
		counter = 101;
	}

	public Employee(String empName, int salary) {

		this.empNo = counter++;
		this.empName = empName;
		this.salary = salary;
	}

	public double getSalary() {

		return salary;
	}

	public void paySlip() {

		System.out.println("name " + empName + "\tid " + empNo + "\tsalary  " + getSalary());

	}

}


//public class Employee {
//
//	private int empNo;
//	private String empName;
//	private double salary;
//	
//	public void paySlip() {
//		System.out.println("Employee No:" + empNo);
//		System.out.println("Employee Name:" + empName);
//		System.out.println("Employee salary:" + salary);
//	}
//	public double getSalary() {
//		return salary;
//		
//	}
//	public Employee() {
//		this(10, "Riya",80000);
//	}
//	
//	
//	
//	
//	
//	public Employee(int empNo, String empName, double salary) {
//		super();
//		this.empNo = empNo;
//		this.empName = empName;
//		this.salary = salary;
//	}
//	public static void main(String[] args) {
//		Employee e1= new Employee(10, "Riya",80000);
//		Employee e2= new Employee();
//		e1.paySlip();
//		System.out.println(e1.getSalary());
//		e2.paySlip();
//		System.out.println(e2.getSalary());
//
//	}
//
//}
