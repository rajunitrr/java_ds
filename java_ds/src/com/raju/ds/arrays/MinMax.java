package com.raju.ds.arrays;

public class MinMax {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 ,4,5};

		System.out.println("Count " + findMinMax(a));
		
	
		
	}

	private static int findMinMax(int[] a) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int count = 0;

		for (int i : a) {

			if (i > max) {
				max = i;
			}

			if (i < min) {
				min = i;
			}

		}

		for (int i : a) {

			if (i > min && i < max) {
				count++;
			}
		}

		return count;
	}

}
