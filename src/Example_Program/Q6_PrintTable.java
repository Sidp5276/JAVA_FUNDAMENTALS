package Example_Program;
import java.util.Scanner;
public class Q6_PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int t = sc.nextInt();
        for (int i=1; i<=10; i++ ){
            System.out.println(t + " x "  + i + " = " + (t * i));
        }
    }
}
