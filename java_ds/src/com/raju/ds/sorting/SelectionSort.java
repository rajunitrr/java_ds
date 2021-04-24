package com.raju.ds.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = { -1, 20, 3, 10, -5, 40, 50 };
		selectionSort(a);
		printArray(a);
	}

	private static void selectionSort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[minIndex] > a[j]) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}

	}

	private static void printArray(int[] a) {

		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
