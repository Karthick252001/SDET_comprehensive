package javaProject;

//Main.java
public class Main {
	public static void main(String[] args) {
		// Test SavingsAccount
		SavingsAccount savingsAccount = new SavingsAccount(5.0, 1000);
		savingsAccount.addToAccount(1500);
		savingsAccount.addToAccount(500);

		// Test CurrentAccount
		CurrentAccount currentAccount = new CurrentAccount(2.0, 5000);
		currentAccount.addToAccount(3000);
		currentAccount.addToAccount(2000);
	}
}
