package Phase_01;
import java.util.Scanner;
public class Q_28_Perfectsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Not a perfect square");
            return;
        }

        int i = 0;
        boolean isSquare = false;

        while (i * i <= n) {
            if (i * i == n) {
                isSquare = true;
                break;
            }
            i++;
        }

        if (isSquare)
            System.out.println("Perfect square");
        else
            System.out.println("Not a perfect square");
    }
}
