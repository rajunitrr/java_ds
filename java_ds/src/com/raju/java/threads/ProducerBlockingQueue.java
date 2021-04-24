package com.raju.java.threads;

import java.util.concurrent.BlockingQueue;

public class ProducerBlockingQueue implements Runnable {

	private BlockingQueue<Integer> blockingQueue;

	public ProducerBlockingQueue(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		int count = 1;
		while (true) {
			try {
				if(blockingQueue.size()<=10) {
					System.out.println("Producing  elements to the queue " + count);
					blockingQueue.add(count++);
				}else {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
