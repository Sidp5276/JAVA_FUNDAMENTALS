package OOPS.POLYMORPHISM;

public class Ex4 {

   static  class Payment {
        void processPayment(double amount) {
            System.out.println("Processing generic payment of ₹" + amount);
        }
    }

   static class UPIPayment extends Payment {
        @Override
        void processPayment(double amount) {
            System.out.println("UPI Payment: Opening Scanner... Sending ₹" + amount + " via UPI ID.");
        }
    }

    static class CardPayment extends Payment {
        @Override
        void processPayment(double amount) {
            System.out.println("Card Payment: Verifying CVV... Charging ₹" + amount + " to Credit Card.");
        }
    }

        public static void main(String[] args) {

            Payment myPayment;

            myPayment = new UPIPayment();
            myPayment.processPayment(500.0);

            myPayment = new CardPayment();
            myPayment.processPayment(2000.0);
        }
    }

