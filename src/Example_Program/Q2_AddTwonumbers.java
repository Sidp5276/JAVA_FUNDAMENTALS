package Example_Program;
import java.util.Scanner;
public class Q2_AddTwonumbers {
    public static void main(String[] args) {
       // int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
int sum = a+b;
System.out.printf("%d + %d = %d", a , b, sum);
    }
}
