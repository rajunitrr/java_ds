package com.raju.ds.arrays;


public class ShuffleCards {

	static int[] shuffleCards(int n) {
		
		int cards[]=new int[n];
		
		for(int i=0;i<n;i++) {
			cards[i]=i+1;
		}
		printArray(cards);
		
		for(int i=0;i<n;i++) {
			double d=Math.random();
			System.out.println(d+" "+(d*n-i));
			int r=i+(int)(d*(n-i));
			int temp=cards[i];
			cards[i]=cards[r];
			cards[r]=temp;
			
		}
			
		
		return cards;
	}
	
	static void printArray(int a[]) {
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		
		int []cards=shuffleCards(52);
		System.out.println("Shuffled Cards");
		printArray(cards);

	}

}
