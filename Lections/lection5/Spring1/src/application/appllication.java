package application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import application.interfaces.Gadget;

public class appllication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new	AnnotationConfigApplicationContext(AppConfig.class);
		String type = "pad";
		Gadget gadjet = context.getBean(type,Gadget.class);
		type = "smartphone";
		Gadget gadjet2 = context.getBean(type,Gadget.class);
		
		System.out.println(gadjet.specification());
		System.out.println(gadjet2.specification());
		context.close();
	}

}
