package OOPS.ABSTRACTION;

abstract class BankSystem {
    abstract void loanInterest();

    void bankPolicy() {
        System.out.println("Bank Policy: KYC verify mandatory");
    }
}

class HDFC extends BankSystem {
    @Override
    void loanInterest() {
        System.out.println("HDFC Loan Interest: 8.5% per annum.");
    }
}

class SBI extends BankSystem {
    @Override
    void loanInterest() {
        System.out.println("SBI Loan Interest: 7.2% per annum.");
    }
}

// YAHAN DEKHO: Ek nayi class banayi jisme main method ko dala
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Banking Abstraction ---");

        BankSystem myBank;

        myBank = new HDFC();
        myBank.loanInterest();

        myBank = new SBI();
        myBank.loanInterest();
    }
}