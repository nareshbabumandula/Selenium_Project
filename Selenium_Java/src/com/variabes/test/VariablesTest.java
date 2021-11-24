package com.variabes.test;

public class VariablesTest {
	
	int a=10; // Instance variable or non static variable
	static int b=20; //static variable or global variable
	
	// Method for re-usability
	public void addition() {
		int a=20; // Local variables are always defined inside a method and hence it's scope is only inside a method
		int b=30;
		System.out.println("Addition of a and b is : "+(a+b) );
	}
	
	// Main method which will be invoked by the JVM
	// Main method is the entry point in java application
	public static void main(String[] args) {
		//Syntax for creating an object reference for a class
		//Classname objRef = new Constructor();
		VariablesTest vt = new VariablesTest();
		vt.addition();
		System.out.println(vt.a);
		System.out.println(vt.hashCode());
		VariablesTest vt1 = new VariablesTest();
		System.out.println(vt1.a);
		System.out.println(vt1.hashCode());
		System.out.println(vt.b);
		System.out.println(vt1.b);
		System.out.println(b); // Access static variable without any instance
		System.out.println(VariablesTest.b); // Access static variable with class reference
		
	}

}
