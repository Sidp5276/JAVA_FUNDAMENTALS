package NestedLoops;
//5. Print a number pattern where each row prints numbers from 1 to row number.

import java.util.Scanner;

public class Q5_RowNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an integer:");
        int r = sc.nextInt();

        for ( int i = 1; i <= r; i++)
        {
        for (int j = 1; j<= i; j++) System.out.print(j + "\t");
        System.out.println();
         }
    }
}
