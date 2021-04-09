package com.raju.test;

public class Array90Degree {

	static void transposeMatrix(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <i; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}

	}

	public static void swap(int[][] a, int i, int j) {

		int temp = a[i][j];
		a[i][j] = a[j][i];
		a[j][i] = temp;
	}

	static void convertArrayTo90Degree(int[][] a) {

		
		for (int i = 0; i < a.length; i++) {

			int start = 0;
			int end = a.length - 1;
			while (start < end) {

				int temp = a[i][start];
				a[i][start] = a[i][end];
				a[i][end] = temp;
				start++;
				end--;
			}
		}
		 
		
		
		/*
		 * for(int j = 0; j < a.length; j++){ for(int i = 0; i < a[j].length / 2; i++) {
		 * int temp = a[j][i]; a[j][i] = a[j][a[j].length - i - 1]; a[j][a[j].length - i
		 * - 1] = temp; } }
		 */
		
	}

	static void printArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

	public static void main(String[] args) {

		//int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		 int a[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 } };

		printArray(a);
		transposeMatrix(a);
		printArray(a);
		convertArrayTo90Degree(a);
		printArray(a);

	}

}
