package Phase_01;
//Take a number and print “Fizz” if divisible by 3, “Buzz” if divisible by 5, and
//“FizzBuzz” if divisible by both.
import java.util.Scanner;
public class Q_30_FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0)
        {
            System.out.println("FizzBuzz");
        }
        else if (n % 3 == 0)
        {
            System.out.println("Fizz");
        }
        else if (n % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(n);
        }
    }
}
