package com.raju.java.threads;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue implements Runnable {

	private BlockingQueue<Integer> blockingQueue;

	public ConsumerBlockingQueue(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {

		while(true) {
			
			try {
				System.out.println("consuming from queue "+blockingQueue.take());
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
