package OOPS.ENCAPSULATION;

import OOPS.ENCAPSULATION.BankAcc;

    public class BankTest {
        public static void main(String[] args) {
            BankAcc myAcc = new BankAcc(1000.0);

            System.out.println("Initial Balance: " + myAcc.getBalance());

            // Test 1: Negative Deposit (Should be rejected)
            System.out.print("\nAttempting -500 deposit: ");
            myAcc.deposit(-500.0);

            // Test 2: Zero Deposit (Should be rejected)
            System.out.print("Attempting 0 deposit: ");
            myAcc.deposit(0);

            // Test 3: Positive Deposit (Should be accepted)
            System.out.print("Attempting 200 deposit: ");
            myAcc.deposit(200.0);

            System.out.println("\nFinal Balance: " + myAcc.getBalance());
        }
    }

