package Phase_01;
import java.util.Scanner;
public class Q_23_Multipleof7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num % 7 == 0) {
            System.out.println(num + " is a multiple of 7.");
        } else if (num % 10 == 7) {
            System.out.println(num + " ends with 7.");
        } else {
            System.out.println(num + " is neither a multiple of 7 nor ends with 7.");
        }
    }
}