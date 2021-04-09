package com.raju.ds.arrays;


public class SubarraySum {

	private static int[] subArraySum(int a[],int sum) {
		
		int currSum=0;
		int start=0;
		for(int i=0;i<a.length;i++) {
			
			currSum+=a[i];
			while(currSum>sum&&start<i) {
				currSum=currSum-a[start];
				start++;
			}
			
			if(sum==currSum) {
				//System.out.println("Found the sum from "+start+" to "+i);
				return new int[] {start,i};
			}
		}
		
		
		return new int[] {-1};
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		
		int result[]=subArraySum(a,12);
		
		for(int i:result) {
			System.out.print(i+",");
		}
		
		
	}

}
