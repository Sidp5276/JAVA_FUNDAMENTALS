package OOPS;

public class Q4_Abstract_Class {

        static interface Refundable {
            void refund(double amount);
        }

        static abstract class Payment {
            double amount;

            Payment(double amount) {
                this.amount = amount;
            }

            void logTransaction() {
                System.out.println("Transaction logged for: $" + amount);
            }

            abstract void process();
        }

        static class CreditCardPayment extends Payment implements Refundable {
            CreditCardPayment(double amount) {
                super(amount);
            }

            @Override
            void process() {
                System.out.println("Processing credit card payment of $" + amount);
            }

            @Override
            public void refund(double amount) {
                System.out.println("Refunded $" + amount + " back to credit card.");
            }
        }

        public static void main(String[] args) {
            CreditCardPayment cc = new CreditCardPayment(150.00);

            cc.logTransaction();
            cc.process();
            cc.refund(50.0);
        }
    }
