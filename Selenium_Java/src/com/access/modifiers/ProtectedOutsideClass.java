package com.access.modifiers;

public class ProtectedOutsideClass {

	public static void main(String[] args) {
		System.out.println("Accessing protected variables, methods and constructor outside the class");
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.username);
		System.out.println(pt.password);
		pt.login();
	}

}
