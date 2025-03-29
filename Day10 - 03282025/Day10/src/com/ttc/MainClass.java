package com.ttc;
public class MainClass {

	public static void main(String[] args) {
	
		Student s= new Student("Ravi");
		
		Student s2= new Student("Ravi");
		
		System.out.println(s.equals(s2));// equals method will do reference comparision
	
		
		String t1 = "Giri";
		String t2 = "Giri";
		
		System.out.println(t1.equals(t2));
		
		
		System.out.println(s2.getClass());
		
		
		
		
		
		
		
		
		
		//System.out.println(s.hashCode());
		//System.out.println(s2.hashCode());
		

	}

}
