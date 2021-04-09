package com.raju.test;

class Test1 {

	public void m1() {
      
		System.out.println("m1 ");
		m2();
	}

	public void m2() {

		System.out.println("m2-super");
	}

}

public class Demo extends Test1 {

	public void m2() {
		System.out.println("m2-child");

	}

	public static void main(String[] args) {

		Demo d=new Demo();
		d.m1();

		boolean f=true;
		if(f) {
			System.out.println("1");
		}else 
			System.out.println("2");
		 System.out.println("b");
		
	}

}
