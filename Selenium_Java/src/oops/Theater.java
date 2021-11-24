package oops;

public abstract class Theater {

	// abstract or unimplemented or bodyless methods
	abstract void ticketBooking();
	abstract void soundSystem();
	abstract void parking();
	abstract void fireandsafety();
	abstract void ticketprices();
	
	static void cafeteria() {
		System.out.println("Cafeteria facility is available");
	}

	// non abstract method or method with body or concrete method
	void onlinebooking(String OnlineBooking){
		System.out.println("Online tictet booking facility is : " + OnlineBooking);
	}
	
	public Theater() {
		System.out.println("This is a constructor for the abstract class Theater..!");
	}


	public static void main(String[] args) {

		//Theater th = new Theater();
		cafeteria();
		Theater.cafeteria();

	}

}
