package Phase_01;
import java.util.Scanner;

public class Q_25_CurrencyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        if (amount % 100 != 0) {
            System.out.println("Amount cannot be evenly divided into 2000, 500, and 100 notes.");
        } else {
            int note2000 = amount / 2000;
            amount %= 2000;

            int note500 = amount / 500;
            amount %= 500;

            int note100 = amount / 100;

            System.out.println("2000 notes: " + note2000);
            System.out.println("500 notes: " + note500);
            System.out.println("100 notes: " + note100);
        }
    }
}
