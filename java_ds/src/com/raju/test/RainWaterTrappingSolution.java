package com.raju.test;

public class RainWaterTrappingSolution {

	public static void main(String[] args) {

		int a[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println("Water units to be stored " + findWaterUnits(a, a.length));
	}

	private static int findWaterUnits(int[] a, int n) {

		int leftMax[] = new int[n];
		int rightMax[] = new int[n];

		leftMax[0] = a[0];
		for (int i = 1; i < n; i++) {
			int max=Math.max(leftMax[i - 1], a[i]);
			leftMax[i] = max;
		}
		//display(leftMax);
		System.out.println();

		rightMax[n - 1] = a[n - 1];
		for (int j = n - 2; j >= 0; j--) {
			rightMax[j] = Math.max(rightMax[j + 1], a[j]);
		}

		//display(rightMax);
          System.out.println();
		int water=0;
		
		for(int i=0;i<n;i++) {
			
			water=water+Math.min(leftMax[i], rightMax[i])-a[i];
			
		}
		return water;
	}
	
	private static void display(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
