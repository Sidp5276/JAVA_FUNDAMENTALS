package Example_Program;
import java.awt.desktop.SystemSleepEvent;
import java.util.*;
public class Q21_InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i ++) {
            for (int j =1; j <= n - i ; j++) {
                System.out.print(" ");
            }
            for(int k =1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
