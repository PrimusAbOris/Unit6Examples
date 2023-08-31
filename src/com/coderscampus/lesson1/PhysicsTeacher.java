package com.coderscampus.lesson1;

public class PhysicsTeacher extends Teacher {
	
	public PhysicsTeacher() {
		System.out.println("We are deep within the PhysicsTeacher constructor. Watch your velocity.");
		this.setClasses("PHYS-101, PHYS-201");
		this.setLevelOfEducation("Master's degree in Physics");
	}
	
	@Override // this is an annotation
	public void teach () {
		// Overrides teach() method in parent class
		System.out.println("I don't care who says what! I shall teach Physics!");
	}
}
