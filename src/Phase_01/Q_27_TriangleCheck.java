package Phase_01;
import java.util.Scanner;

public class Q_27_TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first angle: ");
        int a = sc.nextInt();

        System.out.println("enter second angle: ");
        int b = sc.nextInt();
        int c = 180 - ( a +  b);
        System.out.println("Third angle is: " +  c);
    }
}
