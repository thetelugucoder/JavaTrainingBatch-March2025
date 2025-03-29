package com.ttc.service;

import java.util.List;

import com.ttc.model.Book;
import com.ttc.model.Library;

public class BookService {
	
    private Library library = new Library();

    public void addBook(String title, String author) {
        
            library.addBook(title, author);
            
    }

    public List<Book> getAllBooks() {
        return library.getBooks();
    }

}
