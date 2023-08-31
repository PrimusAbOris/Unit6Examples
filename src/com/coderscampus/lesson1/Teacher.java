package com.coderscampus.lesson1;

public class Teacher {
	private String classes;
	private String levelOfEducation;
	public String name;
	
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
