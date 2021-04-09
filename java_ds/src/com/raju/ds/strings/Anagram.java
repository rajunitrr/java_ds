package com.raju.ds.strings;

public class Anagram {

	static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		// assuming the characters of the strings be lower case only
		int counter[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			counter[s.charAt(i) - 97] ++;
			counter[t.charAt(i) - 97] --;

		}

		for (int j = 0; j < s.length(); j++) {
			if (counter[j] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String s = "abc";
		String t = "acb";

		System.out.println(isAnagram(s, t));

	}

}
