package com.raju.dp;

public class CoinsProblem {

	static int ans=0;
	private static int findDenomination(int n,int max_coin) {
		
		if(n==0) {
			return 1;
		}
	
		int ans=0;
		if(n<=1) {
			ans+=findDenomination(n-1, 1);
		}
		
		if(1<=max_coin ) {
			ans+=findDenomination(n-1, 1);
		}
		if(2<=max_coin && n>=2 ) {
			ans+=findDenomination(n-2, 2);
		}
		
		if(5<=max_coin && n>=5 ) {
			ans+=findDenomination(n-5, 5);
		}
		
		return ans;
	}
	public static void main(String[] args) {

		System.out.println(findDenomination(6, Integer.MAX_VALUE));
		
		
	}

}
