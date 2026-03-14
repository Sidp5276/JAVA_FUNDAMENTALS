package Apna_College;
import java.util.*;
public class Q5_Factorial {

    public static void factorial(int n) {
        if (n < 0) {
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("factorial of number is : " + factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        factorial(n);
    }
}