package NestedLoops;
// 1. Print a square pattern of stars of size n.
import java.util.Scanner;

public class Q1_SquarePattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int star = sc.nextInt();
        for (int i = 0; i < star; i++)
        {
            for (int j = 0; j < star; j++) System.out.print("* \t");
            System.out.println( " \n ");
        }
    }
}
