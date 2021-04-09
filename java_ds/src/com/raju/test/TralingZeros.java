package com.raju.test;

public class TralingZeros {

	private static int trailingZeros(int N) {
		int count = 0;
		long num=5;
		while (N > 0) {
			count = count + N / 5;
			N = N / 5;
		}

		return count;
	}

	public static void main(String[] args) {
		
		int n = 6;
		System.out.println("No Of trailing zeros of a Numbr " + n + " is " + trailingZeros(n));

	}

}
