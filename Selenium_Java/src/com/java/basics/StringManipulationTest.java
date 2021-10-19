package com.java.basics;

public class StringManipulationTest {

	public static void main(String[] args) {
		
		String sText="hello";
		String sText1="WORLD";
		String sText2="welcome to core java training for Selenium";
		
		System.out.println(sText.isEmpty());
		String strText="";
		System.out.println(strText.isEmpty());
		System.out.println(sText.length());
		System.out.println(sText.toUpperCase());
		System.out.println(sText1.toLowerCase());
		System.out.println(sText1.charAt(0));
		System.out.println(sText1.indexOf('W'));
		System.out.println(sText2.contains("Selenium"));
		System.out.println(sText2.contains("selenium"));
		
	}

}
