package com.raju.ds.strings;

public class PalindromTest {

	private static boolean isPalindrom(String s) {

		if (null == s || s.length() == 0) {
			return false;
		}

		for (int i = 0; i < s.length() / 2; i++) {

			if (s.charAt(i) == s.charAt(s.length()-i-1)) {
				continue;
			} else {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {

		String s = "a";
		System.out.println("isPalindrom " + s + " : " + isPalindrom(s));
	}

}
