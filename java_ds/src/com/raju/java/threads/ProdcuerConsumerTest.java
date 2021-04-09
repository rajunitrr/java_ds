package com.raju.java.threads;

import java.util.LinkedList;
import java.util.Queue;

public class ProdcuerConsumerTest {

	public static void main(String[] args) {

		Queue q=new LinkedList();
		int maxSize = 10;
		
		Thread p=new Producer(q, maxSize,"Producer");
		Thread c=new Consumer(q,maxSize,"Consumer");
		
		
		p.start();
		c.start();
		
	}

}
