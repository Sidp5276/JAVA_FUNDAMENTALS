package OOPS;

public class Q1_Encapsulation {

    public class BankAccount {

        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Amount deposited: " + amount);
            } else {
                System.out.println("Invalid amount!");
            }
        }
    }
}
