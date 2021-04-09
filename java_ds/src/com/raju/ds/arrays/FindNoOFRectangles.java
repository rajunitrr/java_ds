package com.raju.ds.arrays;


public class FindNoOFRectangles {

	public static void main(String[] args) {

		int a[]= {2,3,4,5};
		System.out.println("No Of rectangales "+finNoOFrectangle(a,14));
	}
	
	
	static int finNoOFrectangle(int[] a, int maxArea) {
		
		int ans=0;
		int j=a.length-1;
		int n=a.length;
		int i=0;
		 
		while(i<=j) {
			
			if(a[i]*a[j]<maxArea) {
				ans+=j-i+1;
				j--;				
			}
			i++;
		}
		
		return ans;
	}
	

//bruteforce
	static int finNoOFrectangles(int[] a, int maxArea) {
		
		int ans=0;
		int j=0;
		for(int i=0;i<a.length;i++) {
			
			for(j=i;j<a.length;j++) {
				 if(a[i]*a[j]>=maxArea) {
					 break;
				 }
			}
			
			ans+=(j-i);
			
		}
		
		return ans;
	}
	
	

}
