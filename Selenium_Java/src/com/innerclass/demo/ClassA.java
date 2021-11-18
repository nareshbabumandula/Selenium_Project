package com.innerclass.demo;

public class ClassA {
	
	//Inner Class
	class ClassB{
		
		void display() {
			System.out.println("Display method of inner class");
		}
		
		ClassB(){
			System.out.println("Inner class constructor");
		}
		
	}
	
	ClassA(){
		System.out.println("Outer class constructor");
	}

	public static void main(String[] args) {
		//Instantiating the outer class - ClassA
		ClassA a = new ClassA();
		//a.display();
		ClassA.ClassB b = a.new ClassB();
		b.display();
	}

}
