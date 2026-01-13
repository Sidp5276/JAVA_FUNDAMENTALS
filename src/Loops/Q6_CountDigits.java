package Loops;
//6. Count how many digits are in a number using a loop.
import java.util.Scanner;

public class Q6_CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = sc.nextLong();

        if(n==0)
        {
            System.out.println(1); return;
        }
        if (n<0)
            n=-n;
        int c=0;
        while(n>0)
        {
            c++; n/=10;
        }
        System.out.println("Total number of digit is: " + c);
    }
}
