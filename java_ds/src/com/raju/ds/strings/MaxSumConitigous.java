package com.raju.ds.strings;

public class MaxSumConitigous {

	public static void main(String[] args) {

		int a[] ={10,20,5,40,50,-100,200,300};

		findMaxSum(a);
	}

	private static void findMaxSum(int[] a) {

		if (a == null || a.length == 0) {
			System.out.println(Integer.MIN_VALUE);
			return;
		}

		int max1 = Integer.MIN_VALUE, max2 = 0;
        int s=0,e=0,start=0;
		for (int i = 0; i < a.length; i++) {
			max2 += a[i];
			if (max1 < max2) {
				max1 = max2;
				start=s;
				e=i;
			}
			
			if(max2<0) {
				max2=0;
				s=i+1;
			}

		}

		System.out.println("max sum  " + max1+" s"+start+" e"+e);

	}

}
