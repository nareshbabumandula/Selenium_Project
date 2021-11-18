package com.java.basics;

public class CastingTest{
	
	void run() {
		System.out.println("Executing run method from CastingTest class");
	}

	public static void main(String[] args) {
		
		//CastingTest ct = new CastingTest();
		//ct.run();
	

	}

}


class Demo extends CastingTest{
	
	void display() {
		System.out.println("Executing display method from Demo class..!");
	}
	
	public static void main(String[] args) {
		
		//Demo d = new CastingTest(); // Down casting
		CastingTest cT= new Demo(); // Upcasting
	}
	
}
