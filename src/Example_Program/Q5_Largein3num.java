package Example_Program;
import java.util.Scanner;
public class Q5_Largein3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
        System.out.println("Enter number c: ");
        int c = sc.nextInt();
        int large;
        if(a>= b && a>= c)
        {
            large = a;
        } else if (b>= a && b>= c){
            large = b;
        }
        else {
            large = c;
        }
        System.out.println("Largest number is:  " + large);
            }
}
