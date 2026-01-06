package Phase_01;
//Take two numbers and print the larger one.
import java.util.Scanner;

public class Q_06_LargerNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Compare the numbers
        if (num1 > num2) {
            System.out.println("The larger number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The larger number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
