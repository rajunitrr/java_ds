package com.raju.ds.strings;

public class MergeSort {
	
	
	
	private static void  mergeSort(int[] a,int l,int e) {
		
		if(l<e) {
			
			int m=(l+e)/2;
			mergeSort(a, l, m);
			mergeSort(a, m+1, e);
			merge(a,l,m,e);			
		}
		
		
	}
	
	
	

	private static void merge(int[] arr, int l, int m, int r) {

		 // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
	}




	private static int[] sort(int[] a) {

		boolean isSorted = false;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					isSorted = true;
				}
			}

			if (!isSorted) {
				break;
			}

		}

		display(a);
		return a;
	}

	private static void display(int[] a) {

		for (int i : a) {
			System.out.print(" " + i);
		}
	}

	public static void main(String[] args) {

		int[] a = { 10, 5, 20, 40, 30, 50, 70 };

		//a = sort(a);
		mergeSort(a, 0, a.length-1);
		display(a);

	}

}
