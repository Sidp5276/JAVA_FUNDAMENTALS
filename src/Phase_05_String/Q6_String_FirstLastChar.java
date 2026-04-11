package Phase_05_String;
import java.util.Scanner;
public class Q6_String_FirstLastChar {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            if (input.length() > 0) {
                char first = input.charAt(0);
                char last = input.charAt(input.length() - 1);

                System.out.println("First character: " + first);
                System.out.println("Last character: " + last);
            } else {
                System.out.println("String is empty!");
            }
        }
    }