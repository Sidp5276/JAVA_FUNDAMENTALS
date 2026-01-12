package NestedLoops;
// 2. Print a right triangle star pattern.
import java.util.Scanner;

public class Q2_RightTriangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int r = sc.nextInt();

        for ( int i=1; i <= r; i++)
        {
        for ( int j = 1; j <= i; j++) System.out.print("*");
        System.out.println();
        }
    }
}
