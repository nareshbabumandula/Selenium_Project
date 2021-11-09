package com.access.modifiers;

public class PackageOutsideClass {

	public static void main(String[] args) {
		System.out.println("Accessing package variables, methods and constructor outside the class");
		PackageTest pt = new PackageTest();
		System.out.println(pt.username);
		System.out.println(pt.password);
		pt.login();
	}

}
