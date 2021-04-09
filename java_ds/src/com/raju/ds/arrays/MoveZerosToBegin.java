package com.raju.ds.arrays;


public class MoveZerosToBegin {

	public static void main(String[] args) {

		int a[] = { 1, 0, 1, 0, 1, 1, 0, 0 };
		System.out.println("Before ");
		print(a);
		moveZerosToBefore(a);
		System.out.println("\n After ");
		print(a);

	}

	private static void moveZerosToBefore(int[] a) {

		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				swap(a, index++, i);
			}
		}

	}

	static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static void print(int a[]) {

		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
