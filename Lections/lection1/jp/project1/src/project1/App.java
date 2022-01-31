package project1;

public class App {
	
	private String title = "Title";

	public static void main(String[] args) {
		
//		System.out.println("Hello world!");
//		
//		App app = new App();
//		
//		System.out.println(app.title);
		
//		StaticClass.showHello("Roman");
		
		StaticClass staticClass = new StaticClass("Roman");
		
//		staticClass.showHello();
		
		System.out.println(staticClass);
		
	}

}
