package bankaccountapp;

public class Checking extends Account {
	// List properties specific to a checking account
	int debitCardNumber;
	int debitCardPin;
	
	
	//Constructor to initialize checking account properties
	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		
		System.out.println("Type: Checking Account");
		System.out.println("Customer Information:");
		System.out.println("Name: " + name + " SSN: *****" + ssn.substring(5) + " Balance: " + balance + "\n");
	}
	
	// List methods specific to the checking account

}
