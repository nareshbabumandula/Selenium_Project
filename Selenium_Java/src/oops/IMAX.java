package oops;

public class IMAX extends Theater{

	public static void main(String[] args) {
		
		IMAX pv = new IMAX();
		pv.fireandsafety();
		pv.parking();
		pv.soundSystem();
		pv.ticketBooking();
		pv.ticketprices();
		pv.onlinebooking("not available");
	}

	void ticketBooking() {
		System.out.println("Ticket booking facility is available for general, first class and deluxe and VIP categories");
	}

	void soundSystem() {
		System.out.println("Dolby digital sound system facility is available with 3D effect");
	}


	void parking() {
		System.out.println("Parking facility is available to park 400 bikes and 100 cars respectively");
	}


	void fireandsafety() {
		System.out.println("Fire and Safety is taken care with 4 emergency exits and a provision for fire engine to move around");
	}

	void ticketprices() {
		System.out.println("Ticket prices : General - 200, First class - 300, Deluxe-400, VIP-600");
	}

}
