package com.raju.java.threads;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {

	private Queue queue = null;
	private int size;
	private String name;

	public Producer(Queue queue, int maxSize, String name) {
		super(name);
		this.queue = queue;
		this.size = maxSize;
		this.name = name;
	}

	@Override
	public void run() {

		for(int i=1;i<=size;i++) {

			synchronized (queue) {
				if (queue.size() == size) {
					try {
						System.out.println("Queue is full, " + "Producer thread waiting for "
								+ "consumer to take something from queue");

						queue.wait();

					} catch (Exception e) {
						e.printStackTrace();
					}

				}
				System.out.println("Producer is produced " + i);
				queue.add(i);
				queue.notifyAll();

			}

		}
	}

}
