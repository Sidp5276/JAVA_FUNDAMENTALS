package Phase_02;

import java.util.Scanner;

public class Q15_Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i =1;i<=n;i++)
        {
            System.out.printf(i*i*i + "\t");
        }
    }
}
