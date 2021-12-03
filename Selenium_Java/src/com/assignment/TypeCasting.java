package com.assignment;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Using Widening Type casting
		int x = 7;  
		//automatically converts the integer type into long type  
		long y = x;  
		//automatically converts the long type into float type  
		float z = y;  
		System.out.println("x value is"+x);
		System.out.println("y value is"+y);
		System.out.println("z value is"+z);
		
		//Using Narrow Type Casting
		double d = 166.66;  
		//converting double data type into long data type  
		long l = (long)d;  
		//converting long data type into int data type  
		int i = (int)l; 
		System.out.println("d value is"+d);
		System.out.println("l value is"+l);
		System.out.println("i value is"+i);
	}

}
