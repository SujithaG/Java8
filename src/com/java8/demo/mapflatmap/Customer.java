package com.java8.demo.mapflatmap;

import java.util.List;

public class Customer {
	
	private int Id;
	private String name;
	private String email;
	private List<String> phoneNumbers;
	public Customer(int id, String name, String email, List<String> phoneNumbers) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", name=" + name + ", email=" + email + ", phoneNumbers=" + phoneNumbers + "]";
	}
	
	

}
