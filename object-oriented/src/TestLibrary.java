
public class TestLibrary {

	public static void main(String[] args) {
		
		Book b= new Book("The Alchemist");
		Member m= new Member("Polo");
		
//		b.status();
//		m.status();
		b.issueBook(m);
		b.returnBook(m);
		m.status();
		m.setBook(b);
		System.out.println(m.getBook());
		
		
		
	}

}
