package bankaccountapp;

public class Savings extends Account {
	// List properties specific to a savings account
	int safetyBoxID;
	int safetyBoxKey;
	
	
	//Constructor to initialize savings account properties
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);

		System.out.println("Savings");
		System.out.println("SSN: *****\" + ssn.substring(5)");
		System.out.println("Current balance: " + balance + "\n");
	}
	
	
	// List methods specific to the savings account

}
