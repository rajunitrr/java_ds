package com.raju.ds.arrays;


public class RightRoatation {

	public static void reverse(int a[]) {
		int n = a.length;
		for (int i = 0; i < n / 2; i++) {

			int temp = a[n - i - 1];
			a[n - i - 1] = a[i];
			a[i] = temp;
		}
	}

	static void reverseArray(int arr[], int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		reverse(a);
		reverseArray(a, 0, 2);
		reverseArray(a, 3, a.length - 1);
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
