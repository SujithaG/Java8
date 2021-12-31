package com.java8.streamapi.example;

import java.util.ArrayList;
import java.util.List;

import com.java8.demo.lambda.Book;

public class EmployeeDAO {

	public static List<Employee> getEmployees() {
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(1, "Sujitha", "A", 600000));
		employee.add(new Employee(2, "Diya", "A", 900000));
		employee.add(new Employee(3, "Arun", "A", 500000));
		employee.add(new Employee(4, "Prabhu", "B", 800000));
		employee.add(new Employee(5, "Divya", "B", 700000));
		employee.add(new Employee(6, "Sam", "B", 500000));

		return employee;

	}

}
