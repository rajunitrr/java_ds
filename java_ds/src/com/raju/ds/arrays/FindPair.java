package com.raju.ds.arrays;

import java.util.HashMap;

public class FindPair {
	
	static boolean findPair(int[] a,int k) {
		
		HashMap<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		
		for(int i=0;i<a.length;i++) {
			
			if(map.containsKey(k-a[i])) {
				System.out.println("print pair "+a[i]+" ,"+(k-a[i]));
				return true;
			}
			 map.put(a[i], true);
		}
		
		
		return false;
	}

	public static void main(String[] args) {

		int a[]= {7,4,10,5,16,3};
		
		System.out.println("Pair is present "+findPair(a, 9));
		
	}

}
