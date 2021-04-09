package com.raju.test;

class ClassX {
	private int val;

	public ClassX(int val) {
		this.val = val;
	}
	
	public int getM1() {
		return this.val/2;
	}

}

public class ClassA {

	protected static int counter=0;
	private int num1;
	
	public ClassA(int v) {
		ClassA.counter+=1;
		this.num1 = v;
		
	}
	public int m2() {
		this.num1=3;
		return this.num1;
	}
	
	public int getNum() {
		return this.num1;
	}

	public static void main(String[] args) {
		
		ClassA c=new ClassA(10);
		System.out.println(c.getNum()); //10
		System.out.println(c.m2());//3
		System.out.println(c.getNum());//3

		

	}

}
