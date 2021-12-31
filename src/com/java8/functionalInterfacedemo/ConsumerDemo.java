package com.java8.functionalInterfacedemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {


	public static void main(String[] args) {
		Consumer<Integer> consumer = (t)->System.out.println("Print: " +t);
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
		list1.stream().forEach(t->System.out.println("Print: " +t));
	}
	
}
