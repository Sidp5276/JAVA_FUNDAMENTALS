package Phase_05_String;
import java.util.*;
public class Q7_String_Uppercase {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            String upper = input.toUpperCase();

            System.out.println("Uppercase string: " + upper);
        }
    }

