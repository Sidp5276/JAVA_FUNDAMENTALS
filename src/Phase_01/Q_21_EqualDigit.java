package Phase_01;
import  java.util.Scanner;
public class Q_21_EqualDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;
        int firstDigit = num / 1000;

        if (firstDigit == lastDigit) {
            System.out.println("First and last digits are equal.");
        } else {
            System.out.println("First and last digits are NOT equal.");
        }
    }
}