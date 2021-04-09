package com.raju.test;

public class StringTest {


	public static void main(String[] args) {


		String s="ABCDEFDIVGHIJKLMNICPCOPQRSTUVWXYZO";
		
		int f=0,l=0;
		boolean aExit=false;
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			if(ch=='A' && !aExit) {
				f=i;
				aExit=true;
			}
					if(ch=='Z' && aExit) {
				l=i;
				break;
			}
		}
		
		System.out.println((l-f)+1);

	}

}
