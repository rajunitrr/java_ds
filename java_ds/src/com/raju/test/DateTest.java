package com.raju.test;

public class DateTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		long startTime = System.currentTimeMillis();

		Thread.sleep(3000);

		long endTime = System.currentTimeMillis();

		System.out.println("Diff in millis " + (endTime - startTime));
		long duration = (endTime - startTime) / 1000;
		System.out.println("In sesc " + duration);
	}

}
