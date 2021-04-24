package com.raju.ds.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int a[] = { 20, 3, 10, -5, 40, 50 };
		insertionSort(a);
		printArray(a);
	}

	private static void insertionSort(int[] a) {

		int j = 0;
		for (int i = 1; i < a.length; i++) {
			j = i - 1;
			int key = a[i];
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}

			a[j + 1] = key;
			System.out.println();
		}

	}

	private static void printArray(int[] a) {

		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
