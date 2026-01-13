package Loops;
//9. Print the squares of numbers from 1 to n.
import java.util.Scanner;

public class Q9_SquareNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int s = sc.nextInt();
        for(int i = 1; i<=s; i++) System.out.print(i*i + " ");
        System.out.println();
    }
}
