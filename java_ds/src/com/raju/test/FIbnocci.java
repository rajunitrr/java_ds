package com.raju.test;

public class FIbnocci {

	static int fib(int n) {

		if (n == 0 || n == 1)
			return 1;
		else {
			int mem[] = new int[n + 1];
			mem[0] = 1;
			mem[1] = 1;
			for (int i = 2; i <= n; i++) {
				mem[i] = mem[i - 1] + mem[i - 2];
			}
			return mem[n-1];
		}

	}

	static int fib1(int n, int[] mem) {

		if (n == 0 || n == 1) {
			return mem[n]=1;
		} else {
			if (mem[n] == 0) {
				int result = fib1(n - 1, mem) + fib1(n - 2, mem);
				mem[n] = result;
			}

			return mem[n];

		}
	}

	public static void main(String[] args) {

	//	System.out.println("fib of " + fib(5));
		System.out.println("fib of " + fib1(4,new int[5]));
	}

}
