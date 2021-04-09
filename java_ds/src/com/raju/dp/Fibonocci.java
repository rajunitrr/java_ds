package com.raju.dp;

public class Fibonocci {

	private static int fib(int n) {

		int fib[] = new int[n];
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i < n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		return fib[n-1];
	}

	public static void main(String[] args) {
		int n = 2;
		System.out.println("Fib of " + n + " is " + fib(4));
	}

}
