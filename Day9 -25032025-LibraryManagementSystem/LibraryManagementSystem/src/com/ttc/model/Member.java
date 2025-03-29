package com.ttc.model;

public class Member extends User {

	private LibraryCard libraryCard;
	
	public Member(String userId, String name,LibraryCard libraryCard) {
		super(userId, name);
		this.libraryCard= libraryCard;
	}

	public void showDetails() {
		
		 System.out.println("Member: " + name + " | Card Number: " + libraryCard.getCardNumber());
	}

}
