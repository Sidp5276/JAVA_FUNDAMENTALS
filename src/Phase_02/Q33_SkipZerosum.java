package Phase_02;
import java.util.Scanner;
public class Q33_SkipZerosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
       int sum =0;
        for(int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            if(x == 0) continue;
            sum += x;
        }
        System.out.println("Sum of non-zero numbers = " + sum);
    }
}
