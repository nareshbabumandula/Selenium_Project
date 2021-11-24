package oops;

class EncapsulationDemo {
	
	// Instance variables
	private String username="naresh"; //Objects data
	private String password="Secure*1234";
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {

		EncapsulationDemo ed = new EncapsulationDemo();
		System.out.println(ed.username);
		System.out.println(ed.password);
	

	}

}


public class EncapsulationTest extends EncapsulationDemo{
	
	
	public static void main(String[] args) {
		System.out.println("Inside EncapsulationTest class..!");
		EncapsulationTest ed = new EncapsulationTest();
		/*System.out.println(ed.username);
		System.out.println(ed.password);*/
		ed.setUsername("Eshwar");
		System.out.println(ed.getUsername());
		ed.setPassword("Ignorance");
		System.out.println(ed.getPassword());


	}
	
}
