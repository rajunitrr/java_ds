package com.raju.test;

public class Sorted2DMatrix {

	private static void findElement(int a[][], int m, int n, int target) {

		if (target < a[0][0] || target > a[3][4]) {
			System.out.println("Element is not present in the array");
			return;
		}
		int i = 0, j = n - 1;
		while (i < n && j >= 0) {

			System.out.println("" + "( " + i + "," + j + ")");

			if (a[i][j] == target) {
				System.out.println("Element found at " + "( " + i + "," + j + ")");
				break;
			} else if (a[i][j] < target) {
				i++;
			} else {
				j--;
			}

		}

	}

	public static void main(String[] args) {

		int a[][] = { { 10, 20, 30, 40, 50 }, { 15, 25, 35, 45, 55 }, { 17, 26, 37, 46, 56 }, { 27, 40, 58, 60, 71 } };

		findElement(a, 4, 5, 71);

	}

}
