
public class Person implements Cloneable{
	
    //Attributes of class are usually private
	private String name;
	private int age;
	
	public Person() {
//		name="Polo";
//		age=21;
//aka constructor chaining
		this("Anonymous",-1);
	}
	
//	public void setState() {
//		name="Polo";
//		age=21;
//	}
//	
	
	public void print() {
		System.out.println("Name: "+ name+ "\t "+ "Age: "+age);
	}
	
	public Person(String name, int age) {
	 super();
	 this.name = name;
	 this.age = age;
    }
	public static void main(String[] args) throws Exception {
		
		//Declaration // Instantiation
//		Person p = new Person();
		
		//p.setState();
//		p.print();
//		
         Person p = new Person("Mili", 92);
         Person p1 = new Person("Mili", 92);
        // Person p2=(Person) p.clone();
       //  System.out.println(p2);
         System.out.println(p1.equals(p));
         
//		p2.print();
		
//		
//		System.out.println(p.hashCode());
//		System.out.println(p.toString());
		//System.out.println(p); //implicitly calls toString
//	Person p =null;
//	for(int c=1; c<=5; c++) {
//		p=new Person();
//	}
//	System.gc();
	
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p=(Person) obj;
			if(p.name.equals(this.name)&& p.age==age)
				return true;
		}
		return false;
	}

	@Override
	protected void finalize() throws Throwable {
	
//		super.finalize();
		System.out.println("Person is no more");
	}

	@Override
	public String toString() {

//		return super.toString();
		return "Name: " +name+"\tAge: "+age;
	}
}
