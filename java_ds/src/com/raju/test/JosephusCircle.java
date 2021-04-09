package com.raju.test;

public class JosephusCircle {

	private static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		return 2 * pow(a, b - 1);
	}

	static boolean isPowOf2(int n) {

		if (n == 0) {
			return false;
		}

		while (n != 1) {
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;

		}
		return true;
	}
	
	static int josephus(int n, int k)
	{
	if (n == 1)
	    return 1;
	else
	    /* The position returned by josephus(n - 1, k)
	    is adjusted because the recursive call
	    josephus(n - 1, k) considers the original
	    position k%n + 1 as position 1 */
	    return (josephus(n - 1, k) + k-1) % n + 1;
	}

	private static int getJoesphusPosition(int n) {

		if (n == 1 || n == 2||isPowOf2(n)) {
			return 1;
		} else {            
			
			int noOfPowers = 0;
			int n1=n;
			while (n != 1) {
				n = n / 2;
				noOfPowers++;
			}
			int t=n1-pow(2, noOfPowers);
			System.out.println(noOfPowers+"pow "+pow(2, noOfPowers));

			
			return 2 * t + 1;
		}

	}

	public static void main(String[] args) {

		int n = 9;
		System.out.println("Total  People " + n + " and elected position is " + getJoesphusPosition(n));
		System.out.println("Total  People " + n + " and elected position is " + josephus(n, 3));
		
	}

}
