package com.java.basics;

public class StringTest {

	public static void main(String[] args) {
				
		String sText1 = "hello";
		String sText2 = "WORLD";
		String sText3 = "            welcome to core java training            ";
		String sText4 = "";
		String sText5 = "The variety and types of email forms that you can create with myContactForm.com are virtually endless. "
				+ "We have created a system that can be completely tailored to fulfill any of your data submission needs. "
				+ "We offer both the ability to create forms from templates or create custom forms from scractch. "
				+ "The sample form below shows the large variety of field types and questions that are available for your forms. "
				+ "To the left, we have listed a number of forms that can be used as templates. If you can dream it, "
				+ "you can create it!";
		
		System.out.println(sText1.isEmpty());
		System.out.println(sText1.toUpperCase());
		System.out.println(sText2.toLowerCase());
		System.out.println(sText3);
		System.out.println(sText3.trim());
		System.out.println(sText4.isEmpty());
		System.out.println(sText1.charAt(0));
		System.out.println("Length of the string hello is : " + sText1.length() + " characters");
		//System.out.println(sText1.charAt(10));
		System.out.println(sText2.indexOf('D'));
		System.out.println(sText3.contains("java"));
		System.out.println(sText1.equals("hello"));
		System.out.println(sText1.equalsIgnoreCase("HELLO"));
		System.out.println(sText1.concat(" ").concat("world"));
		System.out.println(sText1 + " " + "world");
		System.out.println(sText3.trim().endsWith("training"));
		System.out.println(sText3.trim().startsWith("welcome"));
		System.out.println(sText5.substring(10));
		System.out.println(sText5.substring(0, 5));
		System.out.println(sText3.replace("java", "J2SE"));
		
	}

}
