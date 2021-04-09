package com.raju.ds.arrays;


public class StockProfit {

	public static void main(String[] args) {

		int a[] = {8, 6, 5, 4, 3, 2, 1};
		stackProfit(a);
	}

	private static void stackProfit(int[] array) {

		int current_buy = array[0];
	    int global_sell = array[1];
	    int global_profit = global_sell - current_buy;

	    int current_profit = Integer.MIN_VALUE;
	  
	    for(int i=1; i<array.length; i++) {
	      current_profit = array[i] - current_buy;
	  
	      if(current_profit > global_profit) {
	        global_profit = current_profit;
	        global_sell = array[i];
	      }

	      if(current_buy > array[i]) {
	        current_buy = array[i];
	      }
	    }

		System.out.println( "Buy at " +(global_sell-global_profit)+" Sell at "+global_sell);

	}

}
