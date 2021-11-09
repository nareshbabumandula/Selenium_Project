package com.access.modifiers;

public class PublicTest {
	
	public String username="Dayakar";
	public String password="Secure1234";
	
	public void login() {
		System.out.println("public login method..!");
	}
	
	public PublicTest() {
		System.out.println("This is a public constructor..!");
	}
	

	public static void main(String[] args) {
		
		PublicTest pt = new PublicTest();
		System.out.println(pt.username);
		System.out.println(pt.password);
		pt.login();


	}

}
