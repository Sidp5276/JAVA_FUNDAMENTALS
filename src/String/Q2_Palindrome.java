package String;
// 2. Check if a string is a palindrome.
import java.util.Scanner;

public class Q2_Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String r = " ";
        int len=s.length();
        for ( int i =len-1; i>=0;i--)
        {
         r = r + s.charAt(i);
        }
        if (r.equals(r))
        {
            System.out.println(r + " is palindrome");
        }
        else {
            System.out.println(r + " is not palindrome ");
        }
    }
}
