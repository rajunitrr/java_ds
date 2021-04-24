package com.raju.ds.arrays;

public class FindMaxSubArray {
	
	private static int[] maxSubArray(int a[]) {
		
		int start=0,end=0;
		int max_so_far=Integer.MIN_VALUE,current_sum=0;
		
		for(int i=0;i<a.length;i++) {
			current_sum+=a[i];
			if(current_sum>max_so_far) {
				max_so_far=current_sum;
				end=i;
			}
			
			if(current_sum<0) {
				start++;
				current_sum=0;
				
			}
			
		}
		
		return new int[] {start,end};
	}
	private static int[] minSubArray(int a[]) {
		
		int start=0,end=0;
		int max_so_far=Integer.MAX_VALUE,current_sum=0;
		
		for(int i=0;i<a.length;i++) {
			current_sum+=a[i];
			if(current_sum<max_so_far) {
				max_so_far=current_sum;
				end=i;
			}
	
			
			if(current_sum>Math.abs(a[i])) {
				start=i+1;
				current_sum=0;
				
			}
			
		}
		
		return new int[] {start,end};
	}

	public static void main(String[] args) {

		int a[]={ -2, 3, -4, -1, -2, 1, 5, -3 };
		int r[]=minSubArray(a );
		
		for(int i=r[0];i<=r[1];i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
