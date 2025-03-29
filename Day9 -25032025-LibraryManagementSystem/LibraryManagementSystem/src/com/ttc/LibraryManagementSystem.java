package com.ttc;

import com.ttc.model.Book;
import com.ttc.model.Librarian;
import com.ttc.model.LibraryCard;
import com.ttc.model.Member;
import com.ttc.service.BookService;
import com.ttc.util.FineCalculator;

public class LibraryManagementSystem {

	public static void main(String[] args) {
	
		BookService bookService = new BookService();
		bookService.addBook("Java", "James");
		bookService.addBook("C Lang", "Denis");

		for(Book book : bookService.getAllBooks())
		{
			System.out.println(book.getAuthor() + book.getTitle() + book.isIssued());
		}
		
		/*for(Book book : bookService.getAllBooks())
		{
			System.out.println(book.getTitle()+" "+ book.getAuthor());
		}*/
		
		 Librarian librarian = new Librarian("L001", "Bob");
		 librarian.showDetails();
		
		 LibraryCard card = new LibraryCard("LC123");
		 Member member = new Member("M001", "Alice", card);
		 member.showDetails();
		 
		FineCalculator fineCalculator = new FineCalculator();
	     System.out.println(librarian.collectFine(3, fineCalculator));

	}

}
