package oops;

public class Car {

	int wheels=4,seatingCapacity=5,airbags=4;
	double price;
	String model,brandname;
	
	void safety(String model, String brandname, int airbags) {
		System.out.println(brandname + " " + model + " has " + airbags + " airbags");
	}
	
	void brand(String brandname) {
		System.out.println("Car brand is : " + brandname);
	}
	
	void price(String model, String brandname, double price) {
		System.out.println(brandname + " " + model + " price is " + price);
	}
	
	
	public Car() {
		System.out.println("This is a car class contructor..!");
	}
}
