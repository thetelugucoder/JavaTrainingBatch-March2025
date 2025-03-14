package com.ttc;

public class MainApplication extends Object{

	public static void main(String[] args) {
	
		Parent p = new Parent();
		p.m1(); 
		
		Child c = new Child();
		c.m1();
		
		Parent p2 = new Child();
		p2.m1();
		
		
		
	
	 
		

	}

}
