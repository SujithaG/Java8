package com.java8.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Collectors;

public class New {
	
	public static void main(String[] args) {
		List<String> list1= new ArrayList<String>(Arrays.asList("Suji","Ragul","Ragul","Diya","Suji"));
		
		//Set<String> set = new HashSet<>(list1);
		Map<String,Integer> map = new HashMap<String,Integer>();
		list1.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
}
}
