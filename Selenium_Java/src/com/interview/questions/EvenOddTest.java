package com.interview.questions;

public class EvenOddTest {
	
	void compareNumbers(int num) {
		
		if (num%2==0) {
			System.out.println(num + " : is an even number");
		} else {
			System.out.println(num + " : is an odd number");
		}
	}
	
	public static void main(String[] args) {
		EvenOddTest eot = new EvenOddTest();
		eot.compareNumbers(12);
	}

}
