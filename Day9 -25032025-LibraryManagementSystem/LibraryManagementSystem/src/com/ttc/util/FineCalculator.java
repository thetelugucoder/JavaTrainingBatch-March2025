package com.ttc.util;

public class FineCalculator {

	public int calculateFine(int overdueDays)
	{
		int fine = overdueDays*5; //Fine 5rs per day
		return fine;
	}
}
