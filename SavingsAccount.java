package javaProject;

public class SavingsAccount extends Account {
 private double minimumBalance;

 public SavingsAccount(double interest, double minimumBalance) {
     super(interest);
     this.minimumBalance = minimumBalance;
 }

 @Override
 public double calculateInterest(double amount) {
     if (amount >= minimumBalance) {
         return super.calculateInterest(amount);
     } else {
         return 0;
     }
 }
}

