package bankaccountapp;

public class Checking extends Account {
	// List properties specific to a checking account
	int debitCardNumber;
	int debitCardPin;
	
	
	//Constructor to initialize checking account properties
	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		
		System.out.println("Checking");
		System.out.println("SSN: *****\" + ssn.substring(5)");
		System.out.println("Current balance: " + balance + "\n");
	}
	
	// List methods specific to the checking account

}
