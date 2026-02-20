package Phase_02;

import java.util.Scanner;

public class Q27_nFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print("First " + n + " Fibonacci terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            sum += a;
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
