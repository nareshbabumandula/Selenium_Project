package com.control.statements;

import java.util.Scanner;

public class IfConditionTest {

	
	void ifExample(int a, int b) {
	
		if (a>b) {
			System.out.println("a is greater than b"); // If block
		}else if(a==b) {
			System.out.println("a is equal to b"); // else if block
		}else {
			System.out.println("a is less than b"); // else block
		}
		
	}
	
	void evenorodd(int num) {
		if (num%2==0) {
			System.out.println(num + ": is an even number");
		} else {
			System.out.println(num + ": is an odd number");
		}
	}
	
	void enhancedIf(int a, int b) {
		if(a<b) System.out.println(a+ " is less than " +b);
		else System.out.println(a+ " is greater than " +b);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		
		IfConditionTest it = new IfConditionTest();
		it.ifExample(a,b);
		it.evenorodd(a);
		it.enhancedIf(10, 3);
	}

}
