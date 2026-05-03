package OOPS.ENCAPSULATION;

public class BankAcc {

        private double balance;

        public BankAcc(double initialBalance) {

            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                this.balance = 0;
                System.out.println("Warning: Initial balance cannot be negative. Set to 0.");
            }
        }

        // GETTER
        public double getBalance() {
            return balance;
        }

        // SETTER with Validation (Rejecting Negative Input)
        public void deposit(double amount) {
            if (amount <= 0) {

                System.out.println("Transaction Rejected: Amount must be greater than 0.");
            } else {
                this.balance += amount;
                System.out.println("Success: Amount deposited.");
            }
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Rejected: Insufficient funds!");
            } else if (amount <= 0) {
                System.out.println("Rejected: Invalid withdraw amount.");
            } else {
                this.balance -= amount;
                System.out.println("Success: Amount withdrawn.");
            }
        }
    }
