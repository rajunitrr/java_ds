package com.raju.ds.arrays;

import java.util.ArrayList;
import java.util.List;

public class Find2ndGreaterElements {

	static Object[] findTheElements(int[] a) {

		int firstMax = a[0];
		int secondMax = 0;

		for (int i = 1; i < a.length; i++) {

			if (a[i] > firstMax) {
				secondMax = firstMax;
				firstMax = a[i];
			}

			if (a[i] > secondMax && a[i] < firstMax) {
				secondMax = a[i];
			}

		}

		List<Integer> list = new ArrayList<Integer>();

		for (int i : a) {

			if (i < secondMax) {
				list.add(i);
			}
		}

		return list.toArray();

	}

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 4, 5};

		Object[] ans = findTheElements(a);

		for (Object o : ans) {
			System.out.print((Integer)o+ " ");
		}
		
		
		int [][]res = new int[4][];
		
	}

}
