package oop1;

import abstract1.AbstractClass1;
import abstract1.Child2;
import abstract1.Interface1;
import abstract1.Interface2;
import abstract1.NonAbstractClass1;

public class Main {

	public static void main(String[] args) {

//		SuperClass1 childClass1 = new ChildClass1("Child");
//		System.out.println(childClass1.getName());
		
		NonAbstractClass1 ac1 = new NonAbstractClass1();
		
//		ac1.abstractMethod();
//		ac1.nonAbstractMethod();
//		ac1.ownMethod();
		
		Interface1 child2 = new Child2();
		
		ac1.setInterface1(child2);
		
		
		
		
		
		}

}
