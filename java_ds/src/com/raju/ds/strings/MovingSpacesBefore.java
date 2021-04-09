package com.raju.ds.strings;


public class MovingSpacesBefore {

	public static void main(String[] args) {

		String s = "this is raju m";

		System.out.println(moveSpacesToBefore(s));
	}

	private static String moveSpacesToBefore(String s) {

		char c[] = s.toCharArray();
		int i = s.length() - 1;

		for (int j = i; j >= 0; j--) {

			if (!isSpace(c[j])) {
				char temp = c[i];
				c[i] = c[j];
				c[j] = temp;
				i--;
			}
		}
		
		return new String(c);
	}

	static boolean isSpace(char c) {

		return c == ' ';
	}

}
