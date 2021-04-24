package com.raju.ds.strings;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PrintFirstCharacter {

	private static void printFirstChar(String s) {

		char c[] = s.trim().toCharArray();
		for (int i = 0; i < c.length; i++) {

			if (i == 0) {
				System.out.println(c[i]);
			} else if (c[i - 1] == ' ') {
				System.out.println(c[i]);
			}

		}

	}

	public static void main(String[] args) {

		String s = "geeksforgeeks";
		
	   LinkedHashSet<Character> map=new LinkedHashSet<>();
	  int maxLength=0;
	  String subString="";
	  
	  for(int i=0;i<s.length();i++){
		  char c=s.charAt(i);
         if(map.contains(c)){
        	 map.clear();   
        	 map.add(c);
         }else {
        	 map.add(c);
        	 if(map.size()>maxLength) {
        		 maxLength=map.size()>maxLength?map.size():maxLength;    
        		 subString=map.toString();
        	 }
         }
		  
	  }
	  
	  System.out.println(maxLength);
	  System.out.println(subString);
	
	
		
		
		//printFirstChar(s);
	}

}
