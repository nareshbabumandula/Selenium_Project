package com.assignment;

public class FactPractice {

	public static void main(String[] args) {
		
		//write a program to find the factorial of a number
		
		int number = 4;
		int factorial = 1;
		for (int i=1; i<=number; i++) {
			factorial=factorial*i; 
					
		}
		
		System.out.println("factorial of a Number is:" +factorial);
		
		
		//extract the mobile number by replacing the special characters.
		
		String S = "@$@$@ mobile number (924)555-23"; 
	    
		S = S.replaceAll("[^0-9]", "");
		
		
		System.out.println(S);
		
	
		
		
				
		
	}
}
