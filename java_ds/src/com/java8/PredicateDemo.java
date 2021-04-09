package com.java8;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> p = a ->(a>10);		
		System.out.println(p.test(20));
	}
}
