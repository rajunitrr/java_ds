package com.raju.ds.arrays;

public class Recursion {
   
	static int count=0;

	static int fact(int n) {

		if (n <= 1) {
			return 1;
		}
		count++;

		return n * fact(n - 1);

	}

	static int fib(int n) {
		
		if(n==0||n==1) {
			return 1;
		}
		count++;
		return fib(n-1)+fib(n-2);
		
		
	}
	
	public static void main(String[] args) {

		System.out.println(fib(5));
		System.out.println(count);
	}

}
