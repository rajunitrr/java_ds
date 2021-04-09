package com.raju.ds.strings;

public class Permutaion {

	public static void main(String[] args) {

		String s = "bbb";
		permutations(s, "");
	}

	private static void permutations(String s, String prefix) {

		//System.out.println(prefix+" "+s);
		if (s.isEmpty()) {
			System.out.println(prefix);
		}
		boolean alpha[] = new boolean[26];
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			String sub = s.substring(0, i) + s.substring(i + 1);

			if (alpha[ch - 'a'] == false)
				permutations(sub, prefix + ch);
			alpha[ch - 'a'] = true;
			
			System.out.println(alpha[ch - 'a'] +" "+sub);
		}

	}

}
