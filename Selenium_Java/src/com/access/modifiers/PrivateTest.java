package com.access.modifiers;

public class PrivateTest {
	
	private String username="Dayakar";
	private String password="Secure1234";
	
	private void login() {
		System.out.println("private login method..!");
	}
	
	public PrivateTest() {
		System.out.println("This is a private constructor..!");
	}
	

	public static void main(String[] args) {
		
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.username);
		System.out.println(pt.password);
		pt.login();


	}

}
