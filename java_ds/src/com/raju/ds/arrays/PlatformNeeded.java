package com.raju.ds.arrays;

import java.util.Arrays;

public class PlatformNeeded {

	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		int n = arr.length;
		System.out.println("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n));

	}

	private static int findPlatform(int[] arr, int[] dep, int n) {

		Arrays.sort(arr);
		Arrays.sort(dep);

		int i = 1, j = 0;
		int platformNeeded = 1, result = 1;

		while (i < n && j < n) {

			if (arr[i] <= dep[j]) {
				platformNeeded++;
				i++;
			} else if (arr[i] >= dep[j]) {
				platformNeeded--;
				j++;
			}

			if (platformNeeded > result) {
				result = platformNeeded;
			}

		}

		return result;
	}

}
