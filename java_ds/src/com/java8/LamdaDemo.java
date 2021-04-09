package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

interface Cal<T> {
	public T process(T a, T b);
}


public class LamdaDemo {

	public static void main(String[] args) {

		Cal<Integer> c = (a, b) -> a + b;
		System.out.println("Sum is " + c.process(10, 20));

		c = (a, b) -> a * b;
		System.out.println("Multiply  is " + c.process(10, 20));

		c = (a, b) -> a / b;
		System.out.println("divide  is " + c.process(10, 20));

		c = (a, b) -> a - b;
		System.out.println("substraction  is " + c.process(10, 20));

		c = (s1, s2) -> s1.compareTo(s2);
		System.out.println("compare  is " + c.process(10, 20));

		Map<String, String> gfg = new HashMap<String, String>();

		// enter name/url pair
		gfg.put("GFG", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org");
		gfg.put("Code", "code.geeksforgeeks.org");
		gfg.put("Quiz", "quiz.geeksforgeeks.org");

		// forEach(action) method to iterate map
		gfg.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));

		Set<String> keys = gfg.keySet();
		/*
		 * Iterator<String> itr=keys.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */

		keys.forEach(s -> System.out.println(s));

		for (Map.Entry<String, String> entry : gfg.entrySet()) {

			String key = entry.getKey();
			String value = entry.getValue();
		}

	}
}
