public class TestEmployee {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e = new Employee("Vishal",5000);
//		e.paySlip();
		Manager m = new Manager("Vishal",6000,1000);
//		m.paySlip();
		
		Executive ex = new Executive("Vishal",7000,500);
	//	ex.paySlip();
		
		showSalary(m);
		showSalary(ex);
		
	}

	private static void showSalary(Executive ex) {
		// TODO Auto-generated method stub
		System.out.println("Ex sal" + ex.getSalary());
	}

	private static void showSalary(Manager m) {
		// TODO Auto-generated method stub
		System.out.println("man sal" + m.getSalary());
	}

}



//public class TestEmployee {
//
//	public static void main(String[] args) {
//		
////		Employee emp = new Employee(10, "Riya",80000);
////		emp.paySlip();
////		System.out.println(emp.getSalary());
//		
//		Manager mgr = new Manager("Garry", 4000, 1200);
//		Executive exec = new Executive("Jack",3400, 500);
//		
//		showSalary(mgr);
//		showSalary(exec);
//	}
//	
//	private static void showSalary(Employee emp) {
//		System.out.println("Emp sal"+ emp.getSalary());
//	}
//	
//	
//	private static void showSalary(Executive exec) {
//		System.out.println("Exec sal"+ exec.getSalary());
//	}
//	private static void showSalary(Manager mgr) {
//		System.out.println("Manager sal"+ mgr.getSalary());
//	}
//
//}
