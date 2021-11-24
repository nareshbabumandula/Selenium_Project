package oops;

public class HDFC implements RBI{

	public static void main(String[] args) {
		HDFC hdfc=new HDFC();
		hdfc.accounttypes();
		hdfc.fixeddeposit();
		hdfc.mortage();
		hdfc.minDeposit();
		hdfc.maxDeposit();
		hdfc.minwithdrawl();
		hdfc.maxwithdrawl();
		RBI.accountcancellation();
	}

	public void accounttypes() {
		System.out.println("Account types are children account, business and salaried");		
	}

	
	public void loans() {
		System.out.println("Educational, Business, Personal and Houseloan facility is availble");
	}


	public void mortage() {
		System.out.println("Mortage loan facility is available");
	}


	public void minwithdrawl() {
		System.out.println("Minimum withdrawl is 100 rupees");
	}


	public void maxwithdrawl() {
		System.out.println("Maximum withdrawl is 50000 rupees per day");
	}


	public void minDeposit() {
		System.out.println("Minimum deposit is 100 rupees");		
	}

	public void maxDeposit() {
		System.out.println("Maximum deposit is 1 crore at bank with proper proofs");
	}

}
