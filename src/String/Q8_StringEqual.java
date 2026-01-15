package String;
//8. Check whether two strings are equal or not.
import java.util.Scanner;

public class Q8_StringEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String a = sc.next(), b = sc.next();
        System.out.println(a.equals(b)? "YES" : "NO");
    }
}