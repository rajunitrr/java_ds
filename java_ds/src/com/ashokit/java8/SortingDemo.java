package com.ashokit.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp {
	Integer id;
	String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

}

public class SortingDemo {

	public static void main(String[] args) {

		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp(10, "Raju"));
		list.add(new Emp(5, "Kumar"));
		list.add(new Emp(50, "abc"));

		System.out.println(list);
		// Collections.sort(list, new EmpComparator()); //without lamda 

		//with lamda exp .more readable,consise 
		Collections.sort(list, (e1, e2) -> e1.name.compareTo(e2.name));
		list.stream().forEach(e -> System.out.println(e.name));

	}

	
	private static class EmpComparator implements Comparator<Emp> {

		@Override
		public int compare(Emp o1, Emp o2) {
			return o1.id.compareTo(o2.id);
		}

	}

}
