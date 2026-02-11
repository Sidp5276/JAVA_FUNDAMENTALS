package Example_Program;
import java.util.Scanner;
public class Q1_Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
    }
}
