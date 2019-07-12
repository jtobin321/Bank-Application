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
		
		System.out.println("Welcome to Bank of Jack, " + name + "! Your new account has been created.");
		System.out.println("Here's a little info to get you started:");
		System.out.println("Account Type:");
		
	}
	
	// List common methods
}
