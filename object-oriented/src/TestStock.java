
public class TestStock {

	public static void main(String[] args) {
		
		
		Stock ril= new Stock();
		Holder h= ril;
		h.viewQuote();
		Broker b= ril;
		b.getQuote(); 
		b.viewQuote();	
		Exchange e= ril;
		e.getQuote();
		e.viewQuote();
		e.setQuote();
	} 

}
