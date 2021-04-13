package com.raju.ds.arrays;

import java.util.Arrays;

public class FindMissingNum {

	private static int findMinSum(int[] a) {

		int i = 0, j = a.length-1, max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;

		Arrays.sort(a);
		while (i <j) {

			int t = a[i] + a[j];

			if (t > 0) {
				if (t < max) {
					max = t;
				}
				j--;
			} else if (t < 0) {
				if (t > min) {
					min = t;
				}
				i++;
			}else {
				System.out.println("Closest sum is "+a[i]+a[j]);
			}
		}

		return (Math.abs(min) > max ? max : min);

	}

	private static int findMissingNumber(int a[]) {

		int x = 0, y = 0, n = a.length;

		for (int i = 0; i < n; i++) {
			x ^= a[i];
		}

		for (int i = 1; i <= n + 1; i++) {
			y ^= i;
		}

		return x ^ y;
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };

		System.out.println(findMissingNumber(a));

		int b[] = { 10, 10, 20, 30, 30, 40 ,40};

		System.out.println(findNonRepeatedNumber(b));
		
		
		int c[]= {-80,-10,1,60,70,85};
		
		System.out.println(findMinSum(c));
	}

	static int findNonRepeatedNumber(int a[]) {

		int x = 0;
		for (int i = 0; i < a.length; i++) {
			x ^= a[i];
		}

		return x;
	}
}
