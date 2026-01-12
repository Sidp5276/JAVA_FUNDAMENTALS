package NestedLoops;
//7. Print a hollow square star pattern.

import java.util.Scanner;

public class Q7_HollowSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int h = sc.nextInt();

        for (int i = 1; i <= h; i++){
            for (int j = 1; j<=h; j++)
            { if (i==1 || i==h || j== 1 || j==h)
                System.out.print("*"); else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
