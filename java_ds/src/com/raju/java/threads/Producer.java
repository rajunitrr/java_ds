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

		int count=1;
		while(true) {

			synchronized (queue) {
				while (queue.size() == size) {
					try {
						System.out.println("Queue is full, " + "Producer thread waiting for "
								+ "consumer to take something from queue");

						queue.wait();

					} catch (Exception e) {
						e.printStackTrace();
					}

				}
				System.out.println("Producer is produced " + count);
				queue.add(count++);
				queue.notifyAll();

			}

		}
	}

}
