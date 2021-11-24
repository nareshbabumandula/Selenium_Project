package com.access.modifiers.outside;

import com.access.modifiers.PublicTest;

public class PublicOutsidePackage {

	public static void main(String[] args) {

		System.out.println("Accessing public variables, methods and constructor outside the package");
		PublicTest pt = new PublicTest();
		System.out.println(pt.username);
		System.out.println(pt.password);
		pt.login();


	}
}
