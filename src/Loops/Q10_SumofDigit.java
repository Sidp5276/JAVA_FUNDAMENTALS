package Loops;
//10. Print the sum of all digits in a number using a loop.
import java.util.Scanner;

public class Q10_SumofDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        long n = sc.nextLong();
        long sum = 0;
        while (n > 0) {
            long digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
