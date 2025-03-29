package com.ttc.model;

import com.ttc.util.FineCalculator;

public class Librarian extends User{

	public Librarian(String userId, String name) {
		super(userId, name);
		
	}

	@Override
	public void showDetails() {
		System.out.println("Librarian Name" + name + " Librarian ID : "+ userId);
		
	}

	public int collectFine(int overdueDays, FineCalculator calculator)
	{
		int fine= calculator.calculateFine(overdueDays);
		return fine;
	}
}
