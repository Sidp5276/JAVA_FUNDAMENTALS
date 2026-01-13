package Loops;
//8. Print the reverse of a number using a loop.
import java.util.Scanner;

public class Q8_Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = sc.nextLong();

        long reversed = 0;
        boolean isNegative = n < 0;

        if (isNegative) {
            n = -n;
        }
        while (n > 0) {
            long digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        if (isNegative) {
            reversed = -reversed;
        }
        System.out.println("Reversed number: " + reversed);
    }
}
