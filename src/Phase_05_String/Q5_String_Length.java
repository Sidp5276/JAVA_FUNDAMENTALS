package Phase_05_String;
import java.util.Scanner;
public class Q5_String_Length {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            int length = input.length();
            System.out.println("Length of the string: " + length);
        }
    }

