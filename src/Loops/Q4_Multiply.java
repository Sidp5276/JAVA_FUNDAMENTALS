package Loops;
//4. Print the multiplication table of any number.
import java.util.Scanner;

public class Q4_Multiply {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int m = sc.nextInt();

        System.out.println("Multiplication Table of " + m + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(m + " x " + i + " = " + (m * i));
        }

    }
}
