package javaProject;

public class CurrentAccount extends Account {
 private double overdraftLimit;

 public CurrentAccount(double interest, double overdraftLimit) {
     super(interest);
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public double calculateInterest(double amount) {
     if (amount > overdraftLimit) {
         return super.calculateInterest(amount - overdraftLimit);
     } else {
         return 0;
     }
 }
}
