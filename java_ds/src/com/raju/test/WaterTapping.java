package com.raju.test;

public class WaterTapping {

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 7 };
		int units = findWaterUnits(a);
		System.out.println(" Units "+units);
		//findWaterMaxUnits(a);

	}

	private static void findWaterMaxUnits(int[] a) {
		int start = 0;
		int end = a.length - 1;
		int ans = 0;
		while (start < end) {

			ans = Math.max(ans, Math.min(a[start], a[end]) * (end - start));

			if (a[start] < a[end]) {
				start++;
			} else {
				end--;
			}

		}

		System.out.println("Total Units " + ans);
	}

	private static int findWaterUnits(int[] height) {

		if (height == null) {
			return 0;
		}

		int resutl = 0;
		int size = height.length;

		int[] leftMax = new int[size];
		int[] rightMax = new int[size];

		leftMax[0] = height[0];
		rightMax[size - 1] = height[size - 1];

		for (int i = 1; i < height.length; i++) {
			leftMax[i] = Math.max(height[i], leftMax[i - 1]);
		}
		printArray(leftMax);

		
		for (int j = height.length - 2; j >= 0; j--) {
			rightMax[j] = Math.max(height[j], rightMax[j +1]);
		}
		printArray(rightMax);


		int ans = 0;

		for (int k = 0; k < height.length; k++) {
			ans += Math.min(leftMax[k], rightMax[k]) - height[k];
		}

		return ans;

	}
	
	private static void printArray(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
