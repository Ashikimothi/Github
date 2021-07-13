
public class Customer {
	private int custId;
	private String custName;
	private double creditLimit;
	public Customer() {
		this(20 ,"Ashi", 900000);
	}
	public Customer(int custId, String custName, double creditLimit) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.creditLimit = creditLimit;
	}
	
	public void print() {
		System.out.println("Name: "+ custName);
		System.out.println("Cust Id: "+ custId);
		System.out.println("Credit Limit:  "+ creditLimit);
	}
	public static void main(String[] args) {
		Customer c1=new Customer();
		Customer c2=new Customer(30, "Toshi", 1000000);
		c1.print();
		System.out.println();
		c2.print();
	}
	

}
