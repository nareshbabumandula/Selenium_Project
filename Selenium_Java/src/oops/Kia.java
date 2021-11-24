package oops;

public class Kia extends Car{
	
	double insurance=20000.00;
	
	public static void main(String[] args) {
		
		Kia k = new Kia();
		k.brand("Seltos");
		k.safety("VX", "Seltos", k.airbags);
		k.price("Seltos", "EX", 1750000.00);
		System.out.println(k.airbags);
		System.out.println(k.wheels);
		System.out.println(k.seatingCapacity);
		System.out.println(k.model);
		System.out.println("Kia seltos insurance price is : " + k.insurance);

	}
	
}
