package Example_Program;
import java.util.*;
public class Q17_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int sum = a + b;
                System.out.println("Addition: " + sum);
                break;
            case 2:
                int subtraction = a - b;
                System.out.println("Subtraction: " + subtraction);
                break;
            case 3:
                int multiply = a * b;
                System.out.println("Multiplication: " + multiply);
                break;
            case 4:
                int divide = a / b;
                System.out.println("Division: " + divide);
                break;
            case 5:
                int remainder = a % b;
                System.out.println("Remainder: " + remainder);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}