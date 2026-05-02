package OOPS.INHERITANCE;
// Real system

public class Ex5 {
    public static void main(String[] args) {

        class Account {
            protected String accountHolder;
            protected double balance;

            public Account(String accountHolder, double balance) {
                this.accountHolder = accountHolder;
                this.balance = balance;
            }

            public void displayInfo() {
                System.out.println("Holder: " + accountHolder);
                System.out.println("Balance: $" + balance);
            }
        }

        class Savings extends Account {
            private double interestRate;

            public Savings(String name, double bal, double rate) {
                // super() calls the Parent constructor
                super(name, bal);
                this.interestRate = rate;
            }

            @Override
            public void displayInfo() {

                super.displayInfo();

                System.out.println("Interest Rate: " + interestRate + "%");
            }
        }

         class Current extends Account {
            private double overdraftLimit;

            public Current(String name, double bal, double limit) {
                super(name, bal);
                this.overdraftLimit = limit;
            }

            @Override
            public void displayInfo() {
                super.displayInfo();
                System.out.println("Overdraft Limit: $" + overdraftLimit);
            }
        }
    }
}