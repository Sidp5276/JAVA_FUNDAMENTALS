package Apna_College;
import java.util.*;
public class Q10_Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int n = sc.nextInt();
        if (n>18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Ineligible");
        }
    }
}
