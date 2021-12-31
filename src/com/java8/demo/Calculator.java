package com.java8.demo;

interface CalculatorInterface{
	//void sum(int input);
	int substract(int i1,int i2);
}

public class Calculator {

	
	
	public static void main(String[] args) {
		//CalculatorInterface cal = (int input) -> {System.out.println("SUM" +input);};
		/*
		 * CalculatorInterface cal = (input) -> {System.out.println("SUM: " +input);};
		 * cal.sum(97);
		 */
		CalculatorInterface cal = (i1,i2)->{
			if(i2<i1)
			{
				throw new RuntimeException("i2 is less than i1");
			}
			else
			{
				return i2-i1;
			}
			};
		System.out.println(cal.substract(78, 8));
	}
}
