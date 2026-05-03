package OOPS.ENCAPSULATION;
// private field get / set

    public class BankAccount {

        private double balance;
        private String accountHolder;

        public BankAccount(String name, double initialBalance) {
            this.accountHolder = name;
            this.balance = initialBalance;
        }
    // get method
        public double getBalance() {
            return balance;
        }

        // set method
        public void setDeposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
                System.out.println("Successfully deposited: " + amount);
            } else {
                System.out.println("Invalid amount! Deposit positive value.");
            }
        }

        public String getAccountHolder() {
            return accountHolder;
        }
    }
