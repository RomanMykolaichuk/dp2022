package abstract1;

public class NonAbstractClass1 extends AbstractClass1 {
	
	private Interface1 interface1;

	@Override
	public void abstractMethod() {
		System.out.println("Realised former abstract method");		
	}
	
	public void ownMethod() {
		System.out.println("Own method");
	}

	public Interface1 getInterface1() {
		return interface1;
	}

	public void setInterface1(Interface1 interface1) {
		this.interface1 = interface1;
	}

}
