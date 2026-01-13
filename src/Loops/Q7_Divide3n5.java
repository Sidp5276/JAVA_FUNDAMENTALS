package Loops;
//7. Print all numbers divisible by 3 and 5 up to n.
import java.util.Scanner;

public class Q7_Divide3n5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        long d = sc.nextLong();

        for (int i = 1; i <= d; i++) {
            System.out.println("Checking number: " + i);
            // Show division process
            System.out.println(" -> " + i + " % 3 = " + (i % 3));
            System.out.println(" -> " + i + " % 5 = " + (i % 5));

            // Check divisibility
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(" ==> " + i + " is divisible by both 3 and 5");
            } else {
                System.out.println(" ==> " + i + " is NOT divisible by both 3 and 5");
            }
            System.out.println();
            
            /* if (i%3==0 && i%5==0) System.out.print(" "+ i + " is divisible by both 3 and 5");
        System.out.println(); */
        }
    }
}
