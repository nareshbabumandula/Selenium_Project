package com.assignment;

public class PrimePractice {

	public static void main(String[] args) {
		
		//Program to print prime number 1-100
		
		for(int i=2; i<= 100; i++) {
			
			boolean isPrime = true;
			
			for(int j = 2; j < i; j++) {
				
				if(i%j == 0) {
					
					isPrime = false;
														
				}
			}
		
			if(isPrime) {
				
			System.out.println(i);
				
				
				
		
			}
 		
		}
	}
}

		
		
	


