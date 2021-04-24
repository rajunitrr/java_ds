package com.raju.ds.sorting;

public class Mergesort {

	public static void main(String[] args) {
		int a[] = { 20, 3, 10, -5, 40, 50 };
		mergeSort(a, 0, a.length - 1);
		printArray(a);
	}

	private static void mergeSort(int[] arr, int start, int end) {

		if (start != end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}

	}

	private static void merge(int[] a, int start, int mid, int end) {

		int i = start;
		int j = mid + 1;
		int k = 0;

		int temp[] = new int[end - start + 1];

		while (i <= mid && j <= end) {

			if (a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}

		while (i <= mid) {
			temp[k++] = a[i++];
		}

		while (j <= end) {
			temp[k++] = a[j++];
		}

		// update back to orginal array

		for (i = start; i <= end; i++) {
			a[i] = temp[i - start];
		}

	}

	private static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
