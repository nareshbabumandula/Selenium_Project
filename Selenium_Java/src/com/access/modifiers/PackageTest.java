package com.access.modifiers;

public class PackageTest {
	
	String username="Dayakar";
	String password="Secure1234";
	
	void login() {
		System.out.println("private login method..!");
	}
	
	PackageTest() {
		System.out.println("This is a package constructor..!");
	}
	

	public static void main(String[] args) {
		
		PackageTest pt = new PackageTest();
		System.out.println(pt.username);
		System.out.println(pt.password);
		pt.login();


	}

}
