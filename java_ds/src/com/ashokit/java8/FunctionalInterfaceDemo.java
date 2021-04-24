package com.ashokit.java8;

@FunctionalInterface
interface Wish {
	public void wish(String s);
	// public void greet(String s);

	public static void greet(String str) {
		System.out.println("Hello" + str);
	}

	default public void d() {
		System.out.println("Default Method");
	}

	public static void main(String[] args) {
		System.out.println("Interface main Demo");
	}

}

interface Child extends Wish {

	public void wish(String s); // like overriding the parent method to get more priority

	public void m1();
}

public class FunctionalInterfaceDemo {

	int a = 100;

	public void m2() {
		int b=800;
		Wish gr = str -> {
			int a = 500;// act as local variables
			System.out.println(a);
			System.out.println(b);
			System.out.println("Hello " + str + this.a);
			a=600;
			//b=1000; act as final 
		};
		System.out.println(a);
		gr.wish("Raju");
		
	}

	public static void main(String[] args) {

		new FunctionalInterfaceDemo().m2();
	}

}
