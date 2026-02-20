package Phase_02;

import java.util.Scanner;

public class Q30_ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        System.out.print("First " + n + " terms of AP: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + i * d + " ");
        }
    }
}