package Phase_05_String;
import java.util.*;
public class Q24_String_SecondHalfReverse {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            int length = str.length();
            int mid = length / 2;

            String firstHalf = str.substring(0, mid);
            String secondHalf = str.substring(mid);

            String reversedSecondHalf = new StringBuilder(secondHalf).reverse().toString();

            System.out.println("Result: " + firstHalf + reversedSecondHalf);
        }
    }
