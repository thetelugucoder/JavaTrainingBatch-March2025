package com.ttc;

public class MainMethod {

	public static void main(String[] args) {
		
		MainMethod s=new MainMethod();
		int total = s.sum(2, 3);
		System.out.println(total);	
	}
	
	int sum(int a, int b)
	{
		int total= a+b;
		return total;
	}
}
