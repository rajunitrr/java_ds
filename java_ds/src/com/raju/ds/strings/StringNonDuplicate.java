package com.raju.ds.strings;
public class StringNonDuplicate {
	
	
	static boolean isDuplicateChars(String s) {
		
		int ch[]=new int[26];
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			//ch[c-97]++;					
			ch[c-97]=ch[c-97]+1;
		}
		
		for(int j=0;j<26;j++) {			
			if(ch[j]>1) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		String s="raaaju";
		
		System.out.println("IS String has no duplicate chars "+isDuplicateChars(s));
	}

}
