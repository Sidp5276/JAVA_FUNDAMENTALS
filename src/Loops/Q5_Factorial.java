package Loops;
//5. Find the factorial of a number using a loop.

import java.util.Scanner;

public class Q5_Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int n = sc.nextInt();
        long f=1;
        for (int i = 1; i<=n; i++) f*=i;
        System.out.println(f);
    }
}
