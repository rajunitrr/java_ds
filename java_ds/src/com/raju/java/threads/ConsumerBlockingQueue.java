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
				if(blockingQueue.size()>=1)
				System.out.println("consuming from queue "+blockingQueue.take());
				else{
					break;
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
