
public class Car {
	private String model;
	private String[] features;
	
	//public Car(String model, String[] features) {
	public Car(String model, String...features) {
		this.model=model;
		this.features=features;
		
	}
	
	public void specs() {
		System.out.println("Features of "+ model);
		for(String f: features)
			System.out.println(" - "+ f);
	}
	
	public static void main(String[] args) {
	//	String[] alotf = {"Keyless", "AC", "Power Windows"};
		//Car alto= new Car("Suzuki Alto",alotf);
		Car alto= new Car("Suzuki Alto","Keyless", "AC", "Power Windows");
		alto.specs();
		
		
//		String[] cretaf = {"ABS", "Moon Roof", "Climate Control","Airbags"};
		Car creta= new Car("Hyundai","ABS", "Moon Roof","AC", "Climate Control","Airbags");
		creta.specs();
	}

	
}
