package Example_Program;
import java.util.Scanner;
public class Q8_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Divisors of " + num + " are:");

        for (int i = 1; i <= num; i++) {
            // Step 3: Check if i divides num completely
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
