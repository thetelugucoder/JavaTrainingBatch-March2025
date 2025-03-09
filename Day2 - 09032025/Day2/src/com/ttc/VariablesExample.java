package com.ttc;

public class VariablesExample {

	//Instance Variables
	String name;
	int age;
	
	//Static Variables
	static String branch;
	
	
	
	
	void sum()
	{
		//Local variables
		int count=10;
		System.out.println(count);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		VariablesExample student1=new VariablesExample();
		student1.name="Suresh";
		student1.age=21;
		
		student1=null;
		
		
		
	
		
		VariablesExample.branch="ece";
		
		System.out.println(VariablesExample.branch);
		
		
		//student1.branch="ece";
		 
		VariablesExample student2=new VariablesExample();
		student1.name="Ramesh";
		student1.age=20;
		
		
		
		
		
		 

	}

}
