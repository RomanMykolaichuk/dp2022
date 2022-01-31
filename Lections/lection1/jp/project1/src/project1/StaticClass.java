package project1;

public class StaticClass {
	
	private String name;
	
	
	
	public StaticClass(String name) {
		super();
		this.name = name;
	}



	public  void showHello() {
		
		System.out.println("Hello "+name+"!");
	}



	@Override
	public String toString() {
		return "{\"name\": \"" + name + "\"}";
	}
	
	

}
