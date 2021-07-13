
public class GenericDemoChild<Z,Y> extends GenericDemo {
    private Y temp;

	

//	@Override
//	public Object getData() {
//		return super.getData();
//	}
//
//	@Override
//	public void setData(Object data) {
//
//		super.setData(data);
//	}
//
//	public GenericDemoChild(X data) {
//		super(data);
//	}
	
    public GenericDemoChild(Z data, Y temp) {
    	super(data);
    	this.temp=temp;
    	}
    
    
    
    
    
	public static void main(String[] args) {
		GenericDemoChild<String ,Integer> d1= new GenericDemoChild<String, Integer>("Hello",100);
	//	d1.setData("Hola");
		System.out.println(d1.getTemp());
		System.out.println(d1.getData());
//		
//		GenericDemoChild<Integer> d2=new GenericDemoChild<Integer>(100);
//		System.out.println(d1.getData());
//		
//		
//		GenericDemoChild d3=new GenericDemoChild("Bonjour");
//		//d3.setData(1000);
//		System.out.println(d3.getData());
	}





	public Y getTemp() {
		return temp;
	}





	public void setTemp(Y temp) {
		this.temp = temp;
	}
     
}
