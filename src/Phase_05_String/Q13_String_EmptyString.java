package Phase_05_String;
import java.util.*;
public class Q13_String_EmptyString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                System.out.println("The string is empty.");
            } else {
                System.out.println("The string is not empty.");
            }
        }
    }
