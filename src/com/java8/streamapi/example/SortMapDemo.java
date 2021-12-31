package com.java8.streamapi.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(69, "d");
		map.put(56, "c");
		map.put(85, "a");
		map.put(48, "f");

		map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue().reversed())
				.forEach(System.out::print);

		Map<Employee, Integer> employee = new HashMap<>();
		employee.put(new Employee(1, "Sujitha", "QA", 600000), 30);
		employee.put(new Employee(2, "Diya", "PROD", 900000), 50);
		employee.put(new Employee(3, "Arun", "PROD", 500000), 20);
		employee.put(new Employee(4, "Prabhu", "DEV", 800000), 80);
		employee.put(new Employee(5, "Divya", "OPS", 700000), 15);
		employee.put(new Employee(6, "Sam", "TESTING", 500000), 10);

		employee.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName)))
				.forEach(System.out::println);

	}

}
