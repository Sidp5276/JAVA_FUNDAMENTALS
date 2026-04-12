package Phase_05_String;
import java.util.*;
public class Q9_String_CountChar {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            int count = 0;
            for (char c : input.toCharArray()) {
                if (c != ' ') {
                    count++;
                }
            }
            System.out.println("Number of characters (excluding spaces): " + count);
        }
    }