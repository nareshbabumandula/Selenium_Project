package com.exceptions.demo;

import com.assignment.Demo;

public class UnCheckedExceptionTest {

	void uncheckedArithmaticExceptionExample() throws ArithmeticException{

		int a=30;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}

	void uncheckedArrayExceptionExample() {

		/*
		 * int marks[]= {10,40,55,75,90}; System.out.println(marks[0]);
		 * System.out.println(marks[1]); System.out.println(marks[5]);
		 * System.out.println(marks[3]);
		 */

		try {
			int marks[]= {10,40,55,75,90};
			System.out.println(marks[0]);
			System.out.println(marks[1]);
			//System.out.println(marks[5]);
			System.out.println(marks[3]);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("This is a catch block..!");
		}finally {
			System.out.println("Executing finally block..!");
		}


	}


	void StringIndexExceptionExample() {
		try {
			String a = "This is like chipping "; // length is 22
			char c = a.charAt(24); // accessing 25th element
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}



	public void classNotFoundExceptionExample() {

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	public void nullpointerExceptionExample() {
		String sText=null;
		System.out.println(sText.length());
	}


	/*
	 * ClassNotFoundException Vs NoClassDefFoundError
	 * 
	 * As the name suggests, ClassNotFoundException is an exception while
	 * NoClassDefFoundError is an error. ClassNotFoundException occurs when
	 * classpath does not get updated with required JAR files while error occurs
	 * when the required class definition is not present at runtime.
	 */

	public static void main(String[] args) {
		UnCheckedExceptionTest uce = new UnCheckedExceptionTest();
		//uce.uncheckedArithmaticExceptionExample();
		//uce.uncheckedArrayExceptionExample();
		//uce.nullpointerExceptionExample();
		//uce.classNotFoundExceptionExample();
		uce.StringIndexExceptionExample();


	}

}
