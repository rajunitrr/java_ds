package com.raju.ds.strings;

public class GenerateNextNumber {

	private static String generateNextNum(int n) {
		StringBuilder sb = new StringBuilder("1");

		while (n-- > 1) {

			StringBuilder temp = new StringBuilder();
			int count = 1;
			for (int i = 1; i < sb.length(); i++) {

				if (sb.charAt(i) == sb.charAt(i - 1)) {
					count++;
				} else {

					temp.append(count);
					temp.append(sb.charAt(i - 1));
					count = 1;
				}
			}

			temp.append(count);
			temp.append(sb.charAt(sb.length() - 1));
			sb = temp;

		}

		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(generateNextNum(4));
	}

}
