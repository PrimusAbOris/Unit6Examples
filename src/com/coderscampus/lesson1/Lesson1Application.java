package com.coderscampus.lesson1;

public class Lesson1Application {
	// Unit 6, Lesson 1
	public static void main(String[] args) {
		Teacher nickDent = new PhysicsTeacher();
		//This works too! Good example of polymorphism.
		//It means you can have something appearing in multiple forms.
		//For instance (ha!), multiple methods of the same name in a class.
		//PhysicsTeacher nickDent = new PhysicsTeacher();
		
		System.out.println(nickDent.getClasses());
		System.out.println(nickDent.getLevelOfEducation());
		nickDent.teach();
		nickDent.teach("Mr. Dent");
		System.out.println(); // clearer output
		
		CompSciclops benSteele = new CompSciclops();
		
		System.out.println(benSteele.getClasses());
		System.out.println(benSteele.getLevelOfEducation());
		benSteele.teach();
		
		// QPT -> Ctrl+Space!
		QuantumPhysicsTeacher quantumTeacher = new QuantumPhysicsTeacher();
		System.out.println(quantumTeacher.getClasses());
		System.out.println(quantumTeacher.getLevelOfEducation());
		quantumTeacher.teach();
		
		Teacher.teach("Trevor Page", 36);
	}

}
