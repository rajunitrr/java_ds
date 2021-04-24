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
			String key = sort(s);
			System.out.println(key);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			map.get(key).add(s);
		}

		return new ArrayList<>(map.values());

	}
	
	private static String sort(String s) {
		
		int a[]=new int[26];
		for(int i=0;i<s.length();i++) {
			a[s.charAt(i)-'a']++;
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<26;i++) {
			if(a[i]!=0) {
				char c=(char)(97+i);
				sb.append(c);
			}
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

		System.out.println(groupAnagrams(strs));
	}

}
