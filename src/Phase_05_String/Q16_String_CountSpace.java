package Phase_05_String;
import java.util.*;
public class Q16_String_CountSpace {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a sentence: ");
            String input = sc.nextLine();

            int spaceCount = 0;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    spaceCount++;
                }
            }
            System.out.println("Number of spaces: " + spaceCount);
        }
    }
