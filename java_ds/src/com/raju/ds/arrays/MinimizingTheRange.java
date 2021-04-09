package com.raju.ds.arrays;


public class MinimizingTheRange {

	private static int mininumNo(int[] a, int[] b, int[] c) {

		int i = 0, j = 0, k = 0;
		int ans = Integer.MAX_VALUE;
		while (i < a.length && j < b.length && k < c.length) {

			int x = a[i], y = b[j], z = c[k];
			int range = max(x, y, z) - min(x, y, z);
			ans = Math.min(ans, range);
			// System.out.println(ans+" r "+range);
			if (ans == 0)
				break;

			if (x == min(x, y, z)) {
				i++;
			} else if (y == min(x, y, z)) {
				j++;
			} else {
				k++;
			}

		}
		return ans;
	}

	private static int max(int a, int b, int c) {

		return a > b ? (a > c ? a : c) : (b > c ? b : c);
	}

	private static int min(int a, int b, int c) {

		return a < b ? (a < c ? a : c) : (b < c ? b : c);
	}

	public static void main(String[] args) {

		int a[] = { 1, 4, 5, 8, 10 };
		int b[] = { 6, 9, 15 };
		int c[] = { 2, 3, 6, 6 };

		System.out.println(mininumNo(a, b, c));

	}

}
