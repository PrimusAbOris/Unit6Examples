package com.coderscampus.lesson1;

public class Teacher {
	private String classes;
	private String levelOfEducation;
	
	public Teacher() {
		// Blank constructor
		// It's preferable in this example to instantiate a class that inherits it
		System.out.println("We are deep within the Teacher constructor. Watch your step.");
		this.classes = "No classes assigned";
		this.levelOfEducation = "No level of education assigned";
	}
	
	private void giveARaise() {
		// This ain't visible to the classes that extend Teacher!
		System.out.println("The teacher has been given a raise.");
	}
	
	public void teach () {
		// This is!
		System.out.println("Teaching in progress...");
	}
	
	public void teach (String teacherName) {
		// This is called overloading. Like with two different constructors,
		// you can have two different methods with the same name if they
		// take different arguments in.
		System.out.println(teacherName + " doesn't care who says what! " +
				teacherName + " shall teach the class!");
	}
	
	public static void teach (String teacherName, int age) {
		System.out.println(teacherName + " doesn't care if his age is " + age + "! " +
				teacherName + " shall teach the class!");
	}
	
	public void teach (int age) {
		System.out.println("We don't care what their name is, but a " + age + " year old"
				+ " teacher shall lead the class.");
	}
	
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getLevelOfEducation() {
		return levelOfEducation;
	}
	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}
	
}
