package com.raju.ds.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

	public static List<List<String>> groupAnagrams(String[] strs) {

		if (strs == null || strs.length <= 0) {
			return new ArrayList<>();
		}

		HashMap<String, List<String>> map = new HashMap<>();
		for (String s : strs) {

			char c[] = s.toCharArray();
			Arrays.sort(c);
			String key = String.valueOf(c);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList());
			}
			map.get(key).add(s);
		}

		return new ArrayList<>(map.values());

	}

	public static void main(String[] args) {

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

		System.out.println(groupAnagrams(strs));
	}

}
