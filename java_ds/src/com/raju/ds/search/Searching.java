package com.raju.ds.search;

public class Searching {
	
	
	private static int firstOccurrrence(int[] a, int k) {

		int start = 0, end = a.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (a[mid] ==k && (mid==0||a[mid-1]!=a[mid])) {
				return mid;
			}

			if (a[mid] >= k) {
				end = mid -1;
			} else {
				start = mid + 1;
			}

		}

		return -1;

	}
	private static int lastOccurrrence(int[] a, int k) {

		int start = 0, end = a.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (mid==a.length-1||(a[mid+1]!=a[mid] )&& a[mid] ==k) {
				return mid;
			}

			if (a[mid] <= k) {
				start = mid +1;
			} else {
				end  = mid - 1;
			}

		}

		return -1;

	}
	

	private static boolean binarySearch(int[] a, int k) {

		int start = 0, end = a.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (a[mid] == k) {
				return true;
			}

			if (a[mid] < k) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return false;

	}
	
	private static boolean binarySearch(int[] a, int start,int end,int k) {


		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (a[mid] == k) {
				return true;
			}

			if (a[mid] < k) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return false;

	}
	
	private static int findPivot(int a[]) {
		
		int start=0,end=a.length-1;
		int n=a.length;
		while(start<=end) {
			
			int mid=start+(end-start)/2;
			
			if(a[mid]>a[mid+1]) {
				return mid;
			}
			
			if(a[mid]<a[n-1]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		
		return -1;
	}
	private static boolean rotatedSortedArray(int a[],int k) {
		int n=a.length;
		if(a[0]<a[n-1]) {
			//sorted
			return binarySearch(a, k);
		}	
		
		int pivot=findPivot(a);
		System.out.println("pviot "+pivot);
        int start=0,end=a.length-1;
		if (a[pivot]>k&& a[0]<pivot) {
			start=0;
			end=pivot-1;
		}else {
			start=pivot+1;			
		}
		
		System.out.println("start "+start+" end "+end);
		return binarySearch(a, start, end, k);
	}

	public static void main(String[] args) {

		int a[] = { 10, 10,10, 30,40,40,40, 40 };

		System.out.println("Is Num found " + binarySearch(a, 500));
		System.out.println("First occurrence "+firstOccurrrence(a, 40));
		System.out.println("last occurrence "+lastOccurrrence(a, 40));
		
		
		int b[]= {4,5,6,7,8,1,2,3};
		System.out.println(rotatedSortedArray(b, 2));
		
	}
	

}
