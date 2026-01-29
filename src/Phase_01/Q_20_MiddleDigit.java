package Phase_01;
import java.util.Scanner;
public class Q_20_MiddleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int n = sc.nextInt();
        if (n < 001 || n > 999) {
            System.out.println("Invalid input! Please enter a 3-digit number.");
        } else {
            int first = n / 100;
            int middle = (n / 10) % 10;
            int last = n % 10;

            if (middle > first && middle > last) {
                System.out.println("Middle digit is the largest.");
            } else if (middle < first && middle < last) {
                System.out.println("Middle digit is the smallest.");
            } else {
                System.out.println("Middle digit is neither largest nor smallest.");
            }
        }
    }
}

