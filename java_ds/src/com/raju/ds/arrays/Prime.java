package com.raju.ds.arrays;

public class Prime {

	static int sqrt(int n) {

		int start = 1, end = n;
		int mid=0;
		int count=0;
		while (start < end) {
            count++;
			 mid = start + (end - start) / 2;

			if (mid * mid == n) {
				break;
			}

			if (mid * mid < n) {
				start = mid + 1;
			
			} else {
				end = mid - 1;
			}

		}
		
		System.out.println(count);

		return mid;

	}

	static boolean isPrime(int N) {

		if (N == 1) {
			return false;
		}

		for (int i = 2; i * i <= N; i++) {

			if (N % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrime(25));
		System.out.println(sqrt(36));
	}

}
