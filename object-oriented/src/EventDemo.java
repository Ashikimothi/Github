 class EventImpl implements Event{

	 @Override
	public void doSomething() {
		System.out.println("First implementation");
	}
}


public  class EventDemo{
	static class EventInnerimpl implements Event{
		 @Override
			public void doSomething() {
				System.out.println("Inner implementation");
			}
		
	}
	public void anotherImpl() {
		class EventNestedImpl implements Event{
			@Override
			public void doSomething() {
				System.out.println("Nested Implementation");
			}
			
		};
		new EventNestedImpl().doSomething();
	}
	
	public void oneMoreImpl() {
		Event e=new Event() {
			@Override
			public void doSomething() {
				System.out.println("ANonymous Implementation");
			}
		};
		e.doSomething();
		
	}
	
	public void oneLastImpl() {
		Event e=()-> System.out.println("Lambda Implementation");
		e.doSomething();
	}
	public static void main(String[] args) {
		EventImpl e1=new EventImpl();
		e1.doSomething();
		EventDemo ed=new EventDemo();
		
		//EventInnerimpl e2=ed.new EventInnerimpl();   //non static class
		EventInnerimpl e2= new EventDemo.EventInnerimpl(); // static class
		e2.doSomething();
		ed.anotherImpl();
		ed.oneMoreImpl();
		ed.oneLastImpl();
		
	}
}