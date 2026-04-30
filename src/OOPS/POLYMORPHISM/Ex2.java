package OOPS.POLYMORPHISM;
import java.util.Scanner;

public class Ex2 {
        static class Printer {

            void print(int value) {
                System.out.println("-> Result (Integer): " + value);
            }

            void print(String value) {
                System.out.println("-> Result (String): " + value);
            }

            void print(double value) {
                System.out.println("-> Result (Double): " + value);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Printer myPrinter = new Printer();

            System.out.print("Enter an Integer: ");
            int i = sc.nextInt();
            myPrinter.print(i);

            sc.nextLine();

            System.out.print("Enter a String: ");
            String s = sc.nextLine();
            myPrinter.print(s);

            System.out.print("Enter a Double value: ");
            double d = sc.nextDouble();
            myPrinter.print(d);

            sc.close();
        }
    }
