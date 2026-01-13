package Loops;
//3. Print all even numbers between 1 and n.

import java.util.Scanner;
public class Q3_Even_1ton {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int e = sc.nextInt();

        for (int i =2; i<=e; i+=2) System.out.print(i + " ");
        System.out.println();
    }
}