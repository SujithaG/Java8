package com.java8.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Suji");
		list.add("Diya");
		list.add("Prabhu");
		list.add("Pavi");
		list.add("Dhivya");
		list.add("Sam");
		//convert list to Stream and iterate
		//list.stream().forEach((t)-> System.out.println(t));
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
		map.put(4,"d");
		
		//convert Map to Stream with enrtrySet() and then iterate
		//map.entrySet().stream().forEach((obj)-> System.out.println(obj));
		
		
		//filter Method for conditional statement
		//iterate the list based on some condition use filter and forEach
		list.stream().filter(t -> t.startsWith("D")).forEach((t)-> System.out.println(t));
		map.entrySet().stream().filter(t -> t.getKey() %2 == 0).forEach((obj)-> System.out.println(obj));
	}

}
