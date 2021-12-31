package com.java8.streamapi.example;

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
		/*
		 * list.stream().sorted().forEach(s-> System.out.println(s));
		 * System.out.println("\n\n");
		 * list.stream().sorted(Comparator.reverseOrder()).forEach(s->
		 * System.out.println(s));
		 */
		
		List<Employee> emplist = EmployeeDAO.getEmployees();
	
		//Collections.sort(emplist,(o1,o2)-> (int) (o2.getSalary()-o1.getSalary()));
		//emplist.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(emp-> System.out.println(emp));
		emplist.stream().sorted(Comparator.comparing(Employee::getId)).forEach(emp-> System.out.println(emp));
		
		
	}

}
