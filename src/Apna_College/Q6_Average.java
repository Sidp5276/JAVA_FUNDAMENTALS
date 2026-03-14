package Apna_College;

import java.util.*;
public class Q6_Average {
    public static void average(int a, int b,int c) {
    int sum = a+b+c;
    double avg = sum/ 3.0;
    System.out.println("Average =: " + avg);
    return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        average(a, b, c);
    }
}
