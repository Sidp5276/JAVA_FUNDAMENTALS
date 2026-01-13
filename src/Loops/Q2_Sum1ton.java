package Loops;
//2. Print the sum of numbers from 1 to n.

import java.util.Scanner;

public class Q2_Sum1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println(sum);
    }
}
