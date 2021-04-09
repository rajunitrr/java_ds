package com.java8;

interface Interface{
	public void get(String s);
}
public class MethodReferenceDemo {

	public MethodReferenceDemo(String s) {
		System.out.println("Constructor !! is called "+s);
	}
	
	void m1() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread!!" + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		
		Interface itf=MethodReferenceDemo::new;
		itf.get("from constructor reference!!");

		Runnable r = new MethodReferenceDemo("raju")::m1;
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread!! " + Thread.currentThread().getName());
		}
		
	}

}
