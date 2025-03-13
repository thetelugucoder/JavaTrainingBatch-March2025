package com.ttc.Application;

import java.util.Scanner;

import com.ttc.Service.GradeCalculation;
import com.ttc.model.Student;

public class StudentGradeCalApplication {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter ID");
		int id = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Percentage");
		int percentage = sc.nextInt();
		
		Student s1 = new Student();
		s1.setId(id);
		s1.setName(name);
		s1.setPercentage(percentage);
		
		GradeCalculation gc=new GradeCalculation();
		char grade = gc.grade(s1);
		
		s1.setGrade(grade);
		
		System.out.println(s1.toString());
		
		
		
		
		
		
		
		
		
	}

}
