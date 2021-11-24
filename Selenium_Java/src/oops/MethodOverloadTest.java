package oops;

public class MethodOverloadTest {
	
	int a=10;
	int b=20;
	
	static void addition(int a, int b, int c) {
		System.out.println("Addition of a,b and c is : " +(a+b+c));
	}
	
	static void addition(boolean b) {
		System.out.println("Boolean value is : " + b);
	}
	
	void addition() {
		System.out.println("Addition of a and b is : " +(a+b));
	}
	
	void addition(int a, int b) {
		System.out.println("Addition of a and b is : " +(a+b));
	}
	
	void addition(double a, double b) {
		System.out.println("Addition of double a and b is : " +(a+b));
	}
	
	// Explicit Constructor
	public MethodOverloadTest() {
		System.out.println("This is an explicit constructor..!");
	}
	
	// Parameterized constructor
	public MethodOverloadTest(int a) {
		System.out.println("This is an parameterized constructor..!");
	}
	
	public static void main(String[] args) {
		
		MethodOverloadTest mot=new MethodOverloadTest();
		mot.addition(10.234,10.44);
		System.out.println("This is a default main method");
		addition(10, 20, 30);
		addition(true);
		
		
	}
	
}
