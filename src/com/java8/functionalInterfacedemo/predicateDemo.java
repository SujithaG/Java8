package com.java8.functionalInterfacedemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicateDemo {

	public static void main(String[] args) {

	List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
	list1.stream().filter(t->t%2==0).forEach(t->System.out.println("Print Even: " +t));

	}
	

}
