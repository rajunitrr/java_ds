package com.raju.ds.arrays;


import java.util.Arrays;

public class RemoveDuplicates {

	private static int[] removeDuplicates(int[] a) {

		int index = 0;
		for (int i = 0; i < a.length; i++) {

			if (i == 0 || a[i] != a[i - 1]) {
				a[index++] = a[i];
			}
		}
		
		return Arrays.copyOf(a, index);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 30, 30, 40, 40, 40 };
		a = removeDuplicates(a);

		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
