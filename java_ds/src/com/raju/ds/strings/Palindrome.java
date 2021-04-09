package com.raju.ds.strings;


public class Palindrome {

	static boolean isPalindrome(String s) {

		int n = s.length();
		for (int i = 0; i < n / 2; i++) {

			if (s.charAt(i) != s.charAt(n - i - 1)) {
				return false;
			}
		}

		return true;
	}

//Can we make a String palindrome by replacing only one character	
	static boolean makePalindrom(String s) {

		int count = 0;

		int n = s.length();
		for (int i = 0; i < n / 2; i++) {

			if (s.charAt(i) != s.charAt(n - i - 1)) {
				count++;
			}
		}

		if (count > 1) {
			return false;
		} else if (count == 0) { // edge case if string is an already palindrome
			if (n % 2 == 0) {
				return false;
			} else {
				return true; // if it is odd then we can change one character
			}
		} else
			return true;
	}

	public static void main(String[] args) {

		String s = "ABBBA";
		System.out.println(isPalindrome(s));

		System.out.println(makePalindrom(s));
	}

}
