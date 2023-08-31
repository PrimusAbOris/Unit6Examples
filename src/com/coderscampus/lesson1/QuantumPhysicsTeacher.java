package com.coderscampus.lesson1;

public class QuantumPhysicsTeacher extends PhysicsTeacher {
	
	public QuantumPhysicsTeacher() {
		System.out.println("We are deep within the QuantumPhysicsTeacher constructor. Watch your gamma rays.");
		this.setClasses("QPHY-101, QPHY-201");
		this.setLevelOfEducation("PhD");
	}
	
	public void teach () {
		System.out.println(" 5.4385769230e-1  -3.5924059690e-1\r\n"
				+ " 7.3049458850e-1   6.8373577420e-1\r\n"
				+ "-1.1361381620e+0   1.1196054830e+0\r\n"
				+ "-3.2165149910e-1  -9.2817033220e-1\r\n"
				+ " 2.6892007090e-1  -4.8211920140e-1");
	}
}
