package Phase_02;

import java.util.Scanner;

public class Q24_AlphabetTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        if (n==0) break;
        char ch = 'A';
        for (int i=1; i <= n; i++) {
            for(int j=1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
} }

