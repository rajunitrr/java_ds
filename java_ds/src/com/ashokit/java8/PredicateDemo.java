package com.ashokit.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

class Person {
	String name;
	Integer age;

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

}

@FunctionalInterface
interface IPredicate {
	public boolean test(Integer i);
}

public class PredicateDemo {

	// without predicate
	private static boolean test(int i) {

		if (i > 10) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		predicateDemos();
		biPredicateDemo();
		collectionCheck();
		nameContains();
		ageVerification();

	}

	private static void biPredicateDemo() {
		// Bi Predicate demo to check 2 parameters condition
		BiPredicate<String, String> bi = (s1, s2) -> s1.equalsIgnoreCase(s2);
		System.out.println(bi.test("raju", "RAJU"));
	}

	private static void predicateDemos() {
		// without predicate
		System.out.println(test(10));

		// with custom functional interface
		IPredicate ip = i -> i > 10;
		System.out.println(ip.test(20));

		// with predefined predicate
		Predicate<Integer> p = (i) -> i > 10; // concise code
		System.out.println(p.test(20));

		Predicate<String> p1 = str -> str.length() > 10;
		System.out.println(p1.test("raju"));
	}

	private static void collectionCheck() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);

		Predicate<Collection> plist = l -> l.isEmpty();
		System.out.println(plist.test(list));
	}

	private static void nameContains() {
		
		String[] names = { "Sunny", "Rashmika", "Kajal", "Kareena" };
		Predicate<String> s = str -> str.charAt(0) == 'K';
		for (String name : names) {

			if (s.test(name)) {
				System.out.println(name);
			}
		}
	}

	private static void ageVerification() {
		Person person = new Person("Raju", 31);
		Predicate<Person> pp = per -> per.age > 18;
		boolean result=isPersonElgible(person, pp);
		System.out.println("Is Elgible for Vote : "+result);
		//System.out.println("Is person elgible for voting " + pp.test(person));
	}

	public static boolean isPersonElgible(Person p,Predicate<Person> pp) {
		return pp.test(p);
	}
}
