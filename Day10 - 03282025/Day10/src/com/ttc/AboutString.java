package com.ttc;

public class AboutString {

	public static void main(String[] args) {
	
		String s="Java"; //Strings immutable
		String s2="Java";
		
		
		StringBuffer a=new StringBuffer("Java"); //StringBuffer Mutable
		
		System.out.println(a.hashCode());
		
		a.append("Core");
		
		System.out.println(a.hashCode());
		
		
		
		//System.out.println(s.hashCode());
		//System.out.println(s2.hashCode());
		
		
	     //s=s.concat(" Core");
	     
	    // System.out.println(s);
	     
	     
		
		
		
		
		

	}

}
