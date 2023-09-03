package com.coderscampus.lesson6;

// This is accessible by classes within the same package
public class PackageAccessModifierExample {
	/* 
	 * These both work if it is inside the lesson1 package:
	 * 
	 * int greatInt = 122;
	 * protected int greatInt = 122;
	 */
	
	public int greatInt = 122;
}
// You will hardly ever use the "package" keyword in the access modifier