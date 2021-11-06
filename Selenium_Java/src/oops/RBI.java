package oops;

public interface RBI {
	
	abstract void accounttypes();
	abstract void loans();
	abstract void mortage();
	abstract void minwithdrawl();
	abstract void maxwithdrawl();
	abstract void minDeposit();
	abstract void maxDeposit();
		
	public default void fixeddeposit() {
		System.out.println("First deposit maturity will be on 7th year from the deposit date");
	}
	
	static void accountcancellation() {
		System.out.println("Customer can cancel his/her account after 24hrs from the account opening");
	}

	
	public static void main(String[] args) {
		//RBI rb = new RBI();
		accountcancellation();
	}


}
