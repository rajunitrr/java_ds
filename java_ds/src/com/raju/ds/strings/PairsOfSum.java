package com.raju.ds.strings;

import java.util.HashSet;

public class PairsOfSum {

	public static void main(String[] args) {
		int a[]= {5, 2,1, 3, 4};
		int sum=6;
		printPairs(a,sum);
		

	}

	private static void printPairs(int[] a, int sum) {

		HashSet<Integer> set=new HashSet<Integer>();

		
		for(int i=0;i<a.length;i++) {
			
			int target=sum-a[i];
			
			if(set.contains(target)) {
				
				System.out.println("pair ("+target+", "+a[i]+" )");
			}else {
				set.add(a[i]);
			}
			
		}
		
	}

}
