package oops;

public class PVR extends Theater{

	public static void main(String[] args) {
		
		PVR pv = new PVR();
		pv.fireandsafety();
		pv.parking();
		pv.soundSystem();
		pv.ticketBooking();
		pv.ticketprices();
		pv.onlinebooking("available");
	}

	void ticketBooking() {
		System.out.println("Ticket booking facility is available for general, first class and deluxe categories");

	}

	void soundSystem() {
		System.out.println("Dolby digital sound system facility is available");
		
	}


	void parking() {
		System.out.println("Parking facility is available to park 300 bikes and 100 cars respectively");
		
	}


	void fireandsafety() {
		System.out.println("Fire and Safety is taken care with 4 emergency exits and a provision for fire engine to move around");
		
	}

	void ticketprices() {
		System.out.println("Ticket prices : General - 100, First class - 200, Deluxe-300");
		
	}

}
