package com.raju.ds.strings;

import java.util.Arrays;

public class LongestSubString {

	public static void main(String[] args) {

		 String str = "geeksforgeeks";
		    System.out.println("The input string is " + str);
		 
		    int len = longestUniqueSubsttr(str);
		    System.out.println("The length of the longest " +
		                       "non-repeating character " +
		                       "substring is " + len);
	}

	private static int longestUniqueSubsttr(String str) {

		int n = str.length();
		 
        int res = 0; // result
 
        // last index of all characters is initialized
        // as -1
        int [] lastIndex = new int[26];
        Arrays.fill(lastIndex, -1);
 
        // Initialize start of current window
        int i = 0;
 
        // Move end of current window
        for (int j = 0; j < n; j++) {
 
            // Find the last index of str[j]
            // Update i (starting index of current window)
            // as maximum of current value of i and last
            // index plus 1
            i = Math.max(i, lastIndex[str.charAt(j)-'a'] + 1);
 
            // Update result if we get a larger window
            res = Math.max(res, j - i + 1);           

 
            // Update last index of j.
            lastIndex[str.charAt(j)-'a'] = j;
        }
        return res;
	}
	 

}