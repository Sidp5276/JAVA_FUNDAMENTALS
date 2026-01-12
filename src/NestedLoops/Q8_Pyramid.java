package NestedLoops;
// 8. Print a pyramid star pattern.

import java.util.Scanner;

public class Q8_Pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int p = sc.nextInt();

        for (int i = 1; i<= p; i++)

        { //1. space
            for ( int j = 1; j <= p - 1; j++) System.out.print(" ");
            //2. star
            for (int k = 1; k <= 2 * i - 1; k++) System.out.print(" * ");
            System.out.println();
        }
    }
}
