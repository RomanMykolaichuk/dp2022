package lection1;

import additional.OtherSampleClass;

public class Lection1 {

	private static String title="Lection1";

	public static void main(String[] args) {

		SampleClass sampleClass = new SampleClass();
		sampleClass.printHelloWorld();
		Lection1 lection1 = new Lection1();
		lection1.displayTitle();
		OtherSampleClass osc = new OtherSampleClass("Sample1");
		System.out.println(osc);

	}

	public void displayTitle() {
		System.out.println(title);

	}

}
