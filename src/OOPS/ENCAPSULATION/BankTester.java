package OOPS.ENCAPSULATION;

import OOPS.ENCAPSULATION.BankAccount;

    public class BankTester {
        public static void main(String[] args) {

            BankAccount myAcc = new BankAccount("SID", 1000.0);

            System.out.println("--- Account Summary ---");
            System.out.println("Holder: " + myAcc.getAccountHolder());
            System.out.println("Current Balance: " + myAcc.getBalance());

            System.out.println("\n--- Transaction Test ---");
            myAcc.setDeposit(500.0);
            myAcc.setDeposit(-200.0);

            System.out.println("\nFinal Balance: " + myAcc.getBalance());

            // Note: myAcc.balance = 999999;
            // Upar wali line error degi kyunki balance private hai!
        }
    }

