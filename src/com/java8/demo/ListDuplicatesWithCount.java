package com.java8.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListDuplicatesWithCount {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>(
				Arrays.asList("Suji", "Suji", "Asvi", "Diya", "Prabhu", "Diya", "Asvi"));
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < list1.size(); i++) {
			if (map.containsKey(list1.get(i))) {
				map.put(list1.get(i), map.get(list1.get(i)) + 1);
			} else {
				map.put(list1.get(i), 1);
			}
		}

		for (Map.Entry<String, Integer> value : map.entrySet()) {
			if (value.getValue() >= 2) {
				System.out.println("Element " + value.getKey() + " Occurs " + value.getValue());
			}
		}

	}

}
