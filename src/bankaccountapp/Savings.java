package bankaccountapp;

public class Savings extends Account {
	// List properties specific to a savings account
	int safetyBoxID;
	int safetyBoxKey;
	
	
	//Constructor to initialize savings account properties
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);

		System.out.println("Type: Savings Account");
		System.out.println("Customer Information:");
		System.out.println("Name: " + name + " SSN: *****" + ssn.substring(5) + " Balance: " + balance + "\n");
	}
	
	
	// List methods specific to the savings account

}
