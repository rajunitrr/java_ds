package com.raju.test;


public class ThreadDemo extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<5000;i++) {
		System.out.println("Thread "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public static String reverse(String s) {
		
		if(s.isEmpty() || s==null) {
			return "";
		}
		
		return reverse(s.substring(1))+s.charAt(0);
		
	}

	public static void main(String[] args) throws Exception {

		ThreadDemo t1=new ThreadDemo();
		ThreadDemo t2=new ThreadDemo();
		ThreadDemo t3=new ThreadDemo();
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		
	}

}
