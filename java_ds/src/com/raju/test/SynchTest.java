package com.raju.test;

public class SynchTest {

	static int i;
	static int n = 50;

	private synchronized void print() {

		for (i++; i < n; i++) {

			System.out.println(" " + i + " by " + Thread.currentThread().getName());
		}
		n = n + 50;
	}

	public static void main(String[] args) {

		SynchTest s = new SynchTest();

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				s.print();
			}
		});
		t.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				s.print();
			}
		});
		t2.start();

	}

}
