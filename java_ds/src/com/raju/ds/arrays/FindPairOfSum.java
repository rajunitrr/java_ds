package com.raju.ds.arrays;


public class FindPairOfSum {

	//a[i]+a[j] =sum
	private static void pairExit(int a[], int k) {

		int ptr1 = 0, ptr2 = a.length - 1;
		while (ptr1 < ptr2) {

			if (a[ptr1] + a[ptr2] == k) {
				System.out.println("Found at " + ptr1 + ", " + ptr2);
			}

			if (a[ptr1] + a[ptr2] > k) {
				ptr2--;
			} else {
				ptr1++;
			}

		}

	}
	
	//a[i]+a[j] =sum
		private static void pairNegative(int a[], int k) {

			int j=1;
			for(int i=0;i<a.length;i++) {
				
				if(i==j) {
					j++;
				}
				
				while(j<a.length&& a[j]-a[i]<k) {
					j++;
				}
				if(j<a.length && a[j]-a[i]==k) {
					System.out.println("Found at " + i + ", " + j);
				}
			}

		}
	
	

	public static void main(String[] args) {

		int a[] = { 3, 5, 8, 13, 17, 19, 22, 31 };
		pairExit(a, 25);
		pairNegative(a, 2);

	}

}
