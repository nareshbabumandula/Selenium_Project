package com.access.modifiers;

public class ProtectedTest {
	
	protected String username="Dayakar";
	protected String password="Secure1234";
	
	protected void login() {
		System.out.println("protected login method..!");
	}
	
	protected ProtectedTest() {
		System.out.println("This is a protected constructor..!");
	}
	

	public static void main(String[] args) {
		
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.username);
		System.out.println(pt.password);
		pt.login();


	}

}
