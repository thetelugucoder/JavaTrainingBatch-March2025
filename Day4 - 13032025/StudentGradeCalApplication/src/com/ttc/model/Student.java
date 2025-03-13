package com.ttc.model;

public class Student {
	
	private int id; //data hiding
	private String name;
	private int percentage;
	private char grade;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + ", grade=" + grade + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	

	

}
