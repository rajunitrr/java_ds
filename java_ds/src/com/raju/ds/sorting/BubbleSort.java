package com.raju.ds.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int a[]= {-10,20,30,40,50};
		bubbleSort(a);
		printArray(a);
	}

	private static void printArray(int[] a) {

		for(int i:a) {
			System.out.print(i+" ");
		}
	}

	private static void bubbleSort(int[] a) {

		int count=0;
		boolean isSortedAlready=true;
		for(int i=0;i<a.length;i++) {
			
			isSortedAlready=true;
			for(int j=0;j<a.length-1-i;j++) {
				count++;
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					isSortedAlready=false;
				}
			}
			if(isSortedAlready) {
				break;
			}
		}
		
		System.out.println("no of iterations "+count);
	}

}
