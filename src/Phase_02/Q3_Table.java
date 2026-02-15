package Phase_02;
import java.util.Scanner;
public class Q3_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=10;i++)
        {
            System.out.println(n + " × " + i + " = " + (n * i));


        }
    }
}
