package Phase_02;
import java.util.Scanner;
public class Q4_N_NaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = n * (n+1)/2;
        System.out.println("natural numbers is "  +  sum);
    }
}
