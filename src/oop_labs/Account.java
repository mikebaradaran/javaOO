package oop_labs;

public class Account {
	public static int counter;  // counter is "shared" amongst all Instances of Account
	private int id; 
	private String owner; 
	private double balance;
	
	static {
		counter = 1;  // only runs once and never again!
	}
	
	public static void setCounter(int startCounter) {
		counter = startCounter;
	}
	
	public Account(String owner, double balance) {
		this.id = counter;
		counter++;
		this.owner = owner;
		this.balance = balance;
	}

	public void Deposit(double amount) { 
		balance += amount;
	}
	
	public void Withdraw(double amount) { 
		balance -= amount;
	}
	
	public String getDetails() {
		return String.format("ID=%d Owner=%-15s Balance=£%.2f", id, owner, balance);
	}
}
