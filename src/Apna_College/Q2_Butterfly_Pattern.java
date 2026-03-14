package Apna_College;
import java.util.*;
public class Q2_Butterfly_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // upper half
        for(int i = 1; i<= n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }

            int s = 2*(n-i);
            for(int k =1;k<=s;k++){
                System.out.print(" ");
            }

            for (int l =1; l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int i = n; i>=1; i--) {
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }

            int s = 2*(n-i);
            for(int k =1;k<=s;k++){
                System.out.print(" ");
            }

            for (int l =1; l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
