package javaProject;

public class Account {
 protected double interest;

 public Account(double interest) {
     this.interest = interest;
 }

 public double calculateInterest(double amount) {
     return amount * interest / 100;
 }

 public void addToAccount(double amount) {
     double calculatedInterest = calculateInterest(amount);
     System.out.println("Adding Rs" + calculatedInterest + " to the account");
 }
}
