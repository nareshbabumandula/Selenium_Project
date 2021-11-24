package oops;

public class Honda extends Kia{

	public static void main(String[] args) {
		
		Honda h = new Honda();
		System.out.println(h.airbags); // Car
		System.out.println(h.insurance); // Kia
		h.brand("Amaze");
	}

}
