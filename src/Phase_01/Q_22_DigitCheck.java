package Phase_01;

import java.util.Scanner;
public class Q_22_DigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num >= -9 && num <= 9) {
            System.out.println("It is a single-digit number.");
        } else if (num >= -99 && num <= 99) {
            System.out.println("It is a double-digit number.");
        } else {
            System.out.println("It is a multi-digit number.");
        }

        sc.close();
    }
}