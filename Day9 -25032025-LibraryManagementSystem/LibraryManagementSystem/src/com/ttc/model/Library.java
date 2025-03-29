package com.ttc.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	List<Book> books= new ArrayList<>();
	
	public void addBook(String title,String author)
	{
		books.add(new Book(title,author));
	}
	
	public List<Book> getBooks()
	{
		return this.books;
	}
	
	
	

}
