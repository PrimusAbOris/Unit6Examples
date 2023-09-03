package com.coderscampus.lesson5;

import com.coderscampus.lesson1.PhysicsTeacher;
import com.coderscampus.lesson1.Teacher;

public class CastingExample {

	public static void main(String[] args) {
		double dubbleBubble = 1928.12745741657; // founding year
		int fYear = (int)dubbleBubble; // taking off the wrapper

		System.out.println(dubbleBubble);
		System.out.println(fYear);
		
		PhysicsTeacher Keine = new PhysicsTeacher();
		((Teacher)Keine).teach();
		Teacher EXKeine = ((Teacher)Keine);
		
		Keine.teach("Keine Kamishirasawa");
		EXKeine.teach(11320);
	}
}
