package com.ttc;
public class StaticExample {

	int a;
	int b;
	
	static int c=10;
	
	
	public static void main(String[] args) {
		
		StaticExample s=new StaticExample();
		
		s.a=10; // reference
		s.sum();
		
		StaticExample.c=20; // static variables--> with classname
		
		StaticExample.sum();
	}
	
	static void sum()
	{
		StaticExample s1=new StaticExample();
		s1.a=30;
	}
	
	void sub()
	{
		a=20;
		
	}
	
	void sample(Vehicle e)
	{
		
	}
}
