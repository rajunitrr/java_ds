package com.raju.test;

import java.util.HashMap;
import java.util.HashSet;

public class FindPairsOfSum {

	public static void main(String[] args) {
		int[] A = { 8, 7, 2, 5, 3, 1, 3, 7 };
		int sum = 10;

		//findPair(A, sum);

		int[] a = { 1, 4, 4, 5, 5, 6, 6,10,11};

		findPairsInSortedArray(a,11);

	}

	private static void findPairsInSortedArray(int[] a,int k) {
		
		int j=a.length-1;
		int i=0;
		while(i<j) {
			
			if(a[i]+a[j]==k) {
				System.out.println("Pair "+a[i]+","+a[j]);
			}
			
			if(a[i]+a[j]>k) {
				j--;
			}else {
				i++;
			}			
		}
		
	}

	private static void findPair(int[] a, int sum) {

		// HashMap<Integer, Integer> map = new HashMap<>(a.length);
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {

			if (set.contains(sum - a[i])) {
				System.out.println(" Pairs " + a[i] + " and " + (sum - a[i]));
				set.remove(sum - a[i]);
				set.remove(a[i]);
			} else {
				set.add(a[i]);
			}

		}

	}

}
