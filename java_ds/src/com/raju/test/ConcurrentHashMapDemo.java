package com.raju.test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap cm=new ConcurrentHashMap<>();
		cm.put(1, 2);
		//cm.put(null,5);
		
		HashMap hm=new HashMap();
		hm.put(1, 2);
		hm.put(1, 3);
		hm.put(null, 4);
		hm.put(null, 6);
		
		System.out.println(hm);
		

	}

}
