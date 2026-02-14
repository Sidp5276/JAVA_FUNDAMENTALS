package Phase_01;
import java.util.Scanner;

public class Q_35_GP_Check{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (b * b == a * c) {
            System.out.println("The numbers are in Geometric Progression.");
        } else {
            System.out.println("The numbers are NOT in Geometric Progression.");
        }
    }
}
