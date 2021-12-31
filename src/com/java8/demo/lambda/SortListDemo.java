package com.java8.demo.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(36);
		list.add(31);
		list.add(51);
		list.add(7);
		list.add(11);
		/*
		 * Collections.sort(list); Collections.reverse(list); System.out.println(list);
		 */
		System.out.println("Sorted List \n");
		list.stream().sorted().forEach(s-> System.out.println(s));
		
		System.out.println("\n\n");
		System.out.println("REverse Order List \n");
		list.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.println(s));
	}

}
