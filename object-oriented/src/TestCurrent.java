
public class TestCurrent {

	public static void main(String[] args) {
		Current c= new Current("Polo");
		c.withdraw(3000);
		c.withdraw(5000);
		c.summary();
		c.deposit(2000);
		c.deposit(4000);
		c.summary();

	}

}
