package com.raju.java.threads;

class EvenThread implements Runnable {

	private Share s;

	public EvenThread(Share s) {
		super();
		this.s = s;
	}

	public void run() {
		try {
			s.printEven();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class OddThread implements Runnable {
	private Share s;

	public OddThread(Share s) {
		super();
		this.s = s;
	}

	public void run() {
		try {
			s.printOdd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Share {

	int n;
	int counter = 1;

	public Share(int n) {
		this.n = n;
	}

	public void printEven() throws InterruptedException {

		synchronized (this) {

			while (counter < n) {

				if (counter % 2 == 1) {
					wait();
				}

				System.out.println(counter);
				counter++;
				notify();
			}

		}

	}

	public void printOdd() throws InterruptedException {
		synchronized (this) {

			while (counter < n) {

				if (counter % 2 == 0) {
					wait();
				}

				System.out.println(counter);
				counter++;

				notify();
			}

		}
	}
}

public class EvenOddNumbers {

	public static void main(String[] args) {

		Share s = new Share(10);

		Thread t1 = new Thread(new EvenThread(s));
		Thread t2 = new Thread(new OddThread(s));

		t1.start();
		t2.start();
	}

}
