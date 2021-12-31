package com.java8.streamapi.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeService {

	/**/
	public static List<Employee> evaluateTax(String input) {

		return (input.equalsIgnoreCase("tax"))
				? EmployeeDAO.getEmployees().stream().filter(emp -> emp.getSalary() > 500000)
						.collect(Collectors.toList())
				: EmployeeDAO.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000)
						.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		System.out.println(evaluateTax("non tax"));
		
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
         long count =  myList.stream().count();
         System.out.println(count);      
	}


}