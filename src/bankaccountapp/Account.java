package bankaccountapp;

public abstract class Account implements IBaseRate{
	// common properties for checking and saving classes
	String name;
	String ssn;
	double balance;
	
	String accountNumber;
	double rate;
	
	// Constructor to set base properties and initialize the account
	public Account(String name, String ssn, double initDeposit) {
		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;
		
		System.out.println("New Account Created!");
	}
	
	// List common methods
}
