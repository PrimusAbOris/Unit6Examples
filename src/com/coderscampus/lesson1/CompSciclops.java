package com.coderscampus.lesson1;

public class CompSciclops extends Teacher {
	
	public CompSciclops() {
		System.out.println("We are deep within the CompSciclops constructor. Watch your eyes.");
		this.setClasses("CSCI-141, CSCI-201");
		this.setLevelOfEducation("Degree in Computer Science");
	}
	
	public void teach () {
		System.out.println("I'm a computer science teacher! Always have been, always will be!");
	}

}
