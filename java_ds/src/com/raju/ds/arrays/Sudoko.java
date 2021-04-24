package com.raju.ds.arrays;

public class Sudoko {

	static boolean check(int a[][], int r, int c, int i) {
		// row and column check
		for (int j = 0; j < 4; j++) {

			if (a[r][j] == i || a[j][c] == i) {
				return false;
			}
		}
		// to find block left upper corner
		int x = (r / 2) * 2;
		int y = (c / 2) * 2;
		// block check
		for (int u = 0; u < 2; u++) {

			for (int v = 0; v < 2; v++) {

				if (a[x + u][y + v] == i) {
					return false;
				}
			}
		}

		return true;
	}

	static boolean sudoko(int sudo[][], int r, int c) {

		if (c == 4) {
			c = 0;
			r++;		}

		if (r == 4) {
			return true;
		}

		if (sudo[r][c] > 0) {
			return sudoko(sudo, r, c + 1);
		}

		for (int i = 1; i <= 4; i++) {
			// check for i valid position
			if (check(sudo, r, c, i)) {
				sudo[r][c] = i;
				// move forward and check
				if (sudoko(sudo, r, c + 1)) {
					return true;				}
				sudo[r][c] = 0; // back tracking
			}

		}

		return false;

	}

	static void printArray(int[][] sudo) {

		for (int i[] : sudo) {

			for (int j : i) {

				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int sudo[][] = { { 0, 0, 0, 0 }, { 0, 3, 2, 0 }, { 0, 0, 0, 1 }, { 4, 0, 3, 0 } };

		System.out.println(sudoko(sudo, 0, 0));

		printArray(sudo);

	}

}
