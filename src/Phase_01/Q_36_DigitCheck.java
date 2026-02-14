package Phase_01;
import java.util.Scanner;

public class Q_36_DigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            int first = num / 100;
            int middle = (num / 10) % 10;
            int last = num % 10;

            if (first + last == middle) {
                System.out.println("Yes! The sum of first and last digit equals the middle digit.");
            } else {
                System.out.println("No! Condition not satisfied.");
            }
        } else {
            System.out.println("Please enter a valid 3-digit number.");
        }
    }
}
