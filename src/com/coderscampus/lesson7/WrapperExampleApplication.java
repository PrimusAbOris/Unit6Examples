package com.coderscampus.lesson7;

public class WrapperExampleApplication {

	public static void main (String[] args) {
		// Wrapper classes: Byte (not byte), Integer (not int), etc.
		
		// 4 ways to store 4
		int primitiveInt = 4;
		Integer wrapperInt = 4; // "auto-boxing"; generally better to use this in the big picture
		int arcaneInt = Integer.valueOf(4); // a method in the Integer class
		Integer arcaneWrapperInt = Integer.valueOf(4);
		
		String aNumber = "123";
		String anotherNumber = "456";
		
		System.out.println(aNumber + anotherNumber); // "123456"
		System.out.println(Integer.parseInt(aNumber) + Integer.parseInt(anotherNumber)); // 579
		
		Boolean someBoolean = null;
		
	    /* throws NullPointerException
		if (someBoolean == true) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		*/
		
		// this doesn't
		if (Boolean.TRUE.equals(someBoolean)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		long firstLong = 10L;
		long secondLong = 10L;
		
		if (firstLong == secondLong) {
			System.out.println("Primitive long comparison works!");
		}
		
		@SuppressWarnings("removal")
		Long firstLongWrapper = new Long(10);
		Long secondLongWrapper = Long.valueOf(10);
		
		// if it's an object wrapper, use .equals(), NOT ==
		if (firstLongWrapper.equals(secondLongWrapper)) {
			System.out.println("Object wrapper Long comparison works!\n" +
								"If you use .equals()!");
		}
		
		Integer sixteen = primitiveInt + wrapperInt + arcaneInt + arcaneWrapperInt;
		
		if (sixteen.equals(16)) {
			System.out.println("Congratulations. You can see into the present.");
		}
	}
	
}
