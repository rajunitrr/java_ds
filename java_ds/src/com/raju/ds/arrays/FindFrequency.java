package com.raju.ds.arrays;

public class FindFrequency {

	public static void main(String[] args) {

		int a[] = { 2, 5, 5, 6, 6, 6, 8, 10 };
		int c=findFrequecny(a, 5);
		System.out.println("frequency "+c);
		
		System.out.println("Max Frequency "+findMaxFrequenceNumber(a));
	}

	private static int  findMaxFrequenceNumber(int [] a) {
		
		int i=0;
		int count=1;
		int maxCount=1;
		for(i=0;i<a.length;i++) {
			
			while(i<a.length-1 && a[i]==a[i+1]) {
				i++;
				count++;
			}
			
			if(maxCount<count) {
				maxCount=count;
				count=1;
			}
		}
		
		return maxCount;
	}
	
	
	private static int findFrequecny(int[] a, int x) {

		int f = findFisrtOccurence(a, x);
		System.out.println("first "+f);

		if (f < 0) {
			return -1;
		}

		int l = findLastOccurence(a, x);
		System.out.println("last "+l);

		return l - f + 1;
	}

	private static int findFisrtOccurence(int[] a, int x) {

		int start = 0;
		int end = a.length;
		while (start <=end) {
			int mid = (start + end)/ 2;

			if (a[mid]==x && (mid==0|| a[mid-1]!=x)) {
				return mid;
			}

			if (a[mid] >= x) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}

	private static int findLastOccurence(int[] a, int x) {
		int start = 0;
		int end = a.length;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (a[mid] == x && (mid == a.length-1 || x != a[mid +1])) {
				return mid;
			}

			if (a[mid] <= x) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			System.out.println(mid+" s "+start+" e "+end);

		}

		return -1;
	}

}
