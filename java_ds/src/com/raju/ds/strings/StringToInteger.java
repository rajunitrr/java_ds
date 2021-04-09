package com.raju.ds.strings;

public class StringToInteger {

	public static int myAtoi(String s) {

		int result = 0;
		boolean isNegative=false;
		try {

			if (s != null) {
				String[] words = s.trim().split(" ");
				for (String word : words) {

					if (word.trim().contains("-")) {
						int index = word.indexOf("-");
						word = word.substring(index + 1);
						isNegative=true;
					}

					try {
						result =isNegative? -1*Integer.parseInt(word):Integer.parseInt(word);
						break;
					} catch (Exception ex) {
						ex.printStackTrace();
						break;
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println(myAtoi("-91283472332"));
		System.out.println(Math.pow(2, 20));
	}

}
