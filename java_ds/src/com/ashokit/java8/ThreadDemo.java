package com.ashokit.java8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo {
	
	
	private static void runDemo() {
		Runnable r = () -> {
			System.out.println("Child thread execution Started");
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName());
			}
			System.out.println("Child thread execution completed");
		};

		Thread t = new Thread(r);
		t.start();
	}
	
	private static void callableDemo() throws InterruptedException, ExecutionException {
		
		Callable<String> c=()->{
			for(int i=0;i<=10;i++) {
				System.out.println("Child thread");
				
			}
			
			return "done ";
		};
		
		ExecutorService service=Executors.newFixedThreadPool(1);
		Future<String>f=service.submit(c);
		System.out.println(f.get());
		service.shutdown();
		
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		//runDemo();
		callableDemo();
		
	}

}
