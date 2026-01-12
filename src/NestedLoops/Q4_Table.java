package NestedLoops;
//4. Print a multiplication table from 1 to n using nested loops.

import java.util.Scanner;

public class Q4_Table {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int t = sc.nextInt();

        for (int i = 1; i<=t; i++)
        {
            for (int j = 1; j <= 10; j++) System.out.print( i*j + " ");
            System.out.println();
        }
    }
}
