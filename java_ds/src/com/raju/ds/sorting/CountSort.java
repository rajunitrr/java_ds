package com.raju.ds.sorting;

public class CountSort {

	static void countSort(String s) {

		int[] c = new int[26];
		for (int i = 0; i < s.length(); i++) {
			c[s.charAt(i) - 65]++;
		}

		for(int j=0;j<c.length;j++) {
			
			if(c[j]!=0) {
				//System.out.println(c.length-j-1);
				char c1=(char)(j+65);
				System.out.println(c1+" : "+c[j]);
			}
		}
	}

	public static void main(String[] args) {

		String s = "rajuUJJ".toUpperCase();
		countSort(s);
	}

}
