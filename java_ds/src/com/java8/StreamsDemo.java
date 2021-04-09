package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=Arrays.asList(1,2,3,4,5,6,8,10,12);
		System.out.println(list);
		List<Integer> evenList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		//		List<Integer> evenList=list.stream().map(i->i+10).collect(Collectors.toList());

		System.out.println(evenList);
		
	}

}
