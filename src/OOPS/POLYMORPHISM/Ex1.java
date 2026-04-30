package OOPS.POLYMORPHISM;

public class Ex1 {
    static class Printer {

                void print(int value) {
                    System.out.println("Printing Integer: " + value);
                }

                void print(String value) {
                    System.out.println("Printing String: " + value);
                }

                void print(double value) {
                    System.out.println("Printing Double: " + value);
                }

                void print(int val1, int val2) {
                    System.out.println("Printing Two Integers: " + val1 + " and " + val2);
                }
            }

            public static void main(String[] args) {
                Printer myPrinter = new Printer();

                myPrinter.print(100);
                myPrinter.print("Hello Java");
                myPrinter.print(99.99);
                myPrinter.print(10, 20);
            }
        }
