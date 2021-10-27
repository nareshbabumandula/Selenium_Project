package oops;

public class Animal {
	
	// Characteristics or data members
	String name;
	int age;
	
	//Behavior or method
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	void run() {
		System.out.println(name + " is running at an age of " + age + " years");
	}
	
	public Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
		
		Animal animal = new Animal("Pillu", 10);
		animal.sleep();
		animal.run();
		System.out.println(animal.name);
		System.out.println(animal.age);
	}

}
