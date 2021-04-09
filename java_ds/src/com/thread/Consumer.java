package com.thread;

import java.util.Queue;

public class Consumer extends Thread {

	private Queue queue = null;

	private int size;
	private String name;

	public Consumer(Queue queue, int maxSize, String name) {
		super(name);
		this.queue = queue;
		this.size = size;
		this.name = name;
	}
	@Override
	public void run() {

		while (true) {

			synchronized (queue) {
				
				if (queue.isEmpty()) {
					
					try {
						System.out.println("Queue is empty !Consumer is waiting ");
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
					System.out.println("Consume "+queue.remove());
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					queue.notifyAll();
				
			}

		}
	}

}
