package com.raju.ds.arrays;

public class MaxProfit {

	public static int maxProfit(int[] prices) {
		int n = prices.length;
		int cost = 0;
		int maxCost = 0;

		if (n == 0) {
			return 0;
		}

		// store the first element of array in a variable

		int min_price = prices[0];

		for (int i = 1; i < n; i++) {

			// now compare first element with all the
			// element of array and find the minimum element

			min_price = Math.min(min_price, prices[i]);

			// since min_price is smallest element of the
			// array so subtract with every element of the
			// array and return the maxCost

			cost = prices[i] - min_price;
			
			

			maxCost = Math.max(maxCost, cost);
			
			System.out.println("min "+min_price+" price"+prices[i]+" cost"+cost+" maxCost"+maxCost);
		}
		return maxCost;
	}

	// Driver Code
	public static void main(String[] args) {
		// stock prices on consecutive days
		int prices[] = { 100, 180, 260, 310, 40, 535, 695 };
		System.out.print(maxProfit(prices));
	}

}
