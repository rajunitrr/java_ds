package com.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueue {

	public static void main(String[] args) {
		BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
		
		ProducerBlockingQueue p=new ProducerBlockingQueue(blockingQueue);
		ConsumerBlockingQueue c=new ConsumerBlockingQueue(blockingQueue);
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		
	}

}
