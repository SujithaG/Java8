package com.java8.demo.lambda;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	/**/
	public List<Book> getBookSorted() {
		List<Book> books = new BookDAO().getBooks();
		// sorting using traditional way using comparator

		Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));

		return books;

	}

	public static void main(String[] args) {
		System.out.println(new BookService().getBookSorted());
	}

}
