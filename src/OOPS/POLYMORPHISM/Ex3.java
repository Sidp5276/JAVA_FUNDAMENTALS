package OOPS.POLYMORPHISM;

public class Ex3 {

        static class Calculator {

            void add(int a, int b) {
                int sum = a + b;
                System.out.println("Adding Integers (" + a + " + " + b + ") = " + sum);
            }

            void add(double a, double b) {
                double sum = a + b;
                System.out.println("Adding Doubles (" + a + " + " + b + ") = " + sum);
            }

            void add(int a, int b, int c) {
                int sum = a + b + c;
                System.out.println("Adding 3 Integers = " + sum);
            }
        }

        public static void main(String[] args) {
            Calculator calc = new Calculator();

            calc.add(10, 20);
            calc.add(15.5, 4.5);
            calc.add(5, 10, 15);
        }
    }

