package Phase_02;

import java.util.Scanner;

public class Q31_GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the common ratio (r): ");
        int r = sc.nextInt();

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();
        int term = a;
        for(int i = 0; i < n; i++) {
            System.out.print(term + " ");
            term *= r;
        }
    }
}