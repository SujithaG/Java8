package com.java8.demo.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public List<Book> getBooks(){
		List<Book> books = new ArrayList<>();
		books.add(new Book(1,"JAVA8",789));
		books.add(new Book(2,"Spring",234));
		books.add(new Book(3,"Hibernate",567));
		books.add(new Book(4,"JSON",345));
		
		return books;
		
		
	}

}
