package com.raju.test;

public class Permutation {

	private static String swap(String s,int i,int j) {
	
		char c[]=s.toCharArray();
	    char temp=c[i];
	    c[i]=c[j];
	    c[j]=temp;
	
		return String.valueOf(c);
	}

	private static void permute(String str,int s,int e)
	{
		  
		if(s==e)
		System.out.println(str);
		else
		{
			 for(int i=s;i<=e;i++)
			 {
				 str=swap(str, s, i);
				 permute(str, s+1, e);
				 str=swap(str, s, i);
				 
				 
			 }
			
		}
		
		
	}
	public static void main(String[] args) {

        String str="RAJU";
        permute(str, 0, str.length()-1);
		 
	}

}
