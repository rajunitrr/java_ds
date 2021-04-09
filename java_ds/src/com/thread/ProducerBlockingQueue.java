package com.thread;

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
				System.out.println("Producing  elements to the queue " + count);
				blockingQueue.add(count++);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
