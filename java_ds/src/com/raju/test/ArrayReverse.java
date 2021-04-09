package com.raju.test;

public class ArrayReverse {

	static void printArray(int a[]) {
		System.out.println();
		for (int i : a) {
			System.out.print(i + ",");
		}
	}

	static void reverseArray(int a[]) {
		int n = a.length;

		for (int i = 0; i < n / 2; i++) {

			int temp = a[i];
			a[i] = a[n - 1 - i];
			a[n - 1 - i] = temp;

		}
	}

	static void reverse(int a[], int l, int r) {
		int n = r - l;

		for (int i = 0; i <n / 2; i++) {
			int temp = a[i + l];
			a[i + l] = a[r - 1 - i];
			a[r - 1 - i] = temp;

		}

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		printArray(a);
		int n=a.length;

		System.out.println();
		// reverseArray(a);
		reverse(a, 0, n);
		printArray(a);

		reverse(a, 0, 3);

		printArray(a);

		reverse(a, 3, n);
		printArray(a);
	}

}
