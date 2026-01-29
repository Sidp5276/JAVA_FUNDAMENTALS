package Phase_01;
import java.util.Scanner;

public class Q_19_DistinctDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }

        int num = sc.nextInt();

        if (Math.abs(num) < 100 || Math.abs(num) > 999) {
            System.out.println("Error: Please enter a valid 3-digit number.");
            return;
        }

        int absNum = Math.abs(num);

        int d1 = absNum / 100;
        int d2 = (absNum / 10) % 10;
        int d3 = absNum % 10;

        if (d1 != d2 && d1 != d3 && d2 != d3) {
            System.out.println(num + " has all distinct digits.");
        } else {
            System.out.println(num + " does not have all distinct digits.");
        }
    }
}
