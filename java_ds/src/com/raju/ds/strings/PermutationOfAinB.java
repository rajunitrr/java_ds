package com.raju.ds.strings;


public class PermutationOfAinB {

	static int isFeqSame(int[] a, int[] b) {

		for (int i = 0; i <= 25; i++) {

			if (a[i] != b[i]) {
				return 0;
			}
		}

		return 1;
	}

	static int solve(String a, String b) {

		int count = 0;
		int n = a.length();
		int m = b.length();
		if (m < n) {
			return 0;
		}

		int A[] = new int[26];
		int B[] = new int[26];

		// build frequency of A

		for (int i = 0; i < n; i++) {
			A[a.charAt(i) - 'a']++;
		}

		// build initial window for B
		for (int i = 0; i < n; i++) {
			B[b.charAt(i) - 'a']++;
		}
		
		count+=isFeqSame(A, B);
		
		//for remaining elements
		for(int i=n;i<m;i++) {
		
			B[b.charAt(i-n)-'a']--; //remove 1st character contribution
			B[b.charAt(i)-'a']++;
			count+=isFeqSame(A, B);
			
		}

		return count;
	}

	public static void main(String[] args) {

		String a = "abc";
		String b = "abcbaccabc";
		
		System.out.println(solve(a, b));
	}

}
