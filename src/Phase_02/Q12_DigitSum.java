package Phase_02;

import java.util.Scanner;

public class Q12_DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int a = sc.nextInt();
        int sum = 0;
        while (a>0)
        {
            sum += a % 10;
            a /= 10;
        }
        System.out.println("sum is:" + sum);
    }
}
