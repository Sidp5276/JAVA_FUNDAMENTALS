package Phase_05_String;
import java.util.*;
public class Q14_String_CountChar {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            int letters = 0, digits = 0, specialChars = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (Character.isLetter(ch)) {
                    letters++;
                } else if (Character.isDigit(ch)) {
                    digits++;
                } else {
                    specialChars++;
                }
            }
            System.out.println("Letters: " + letters);
            System.out.println("Digits: " + digits);
            System.out.println("Special Characters: " + specialChars);
        }
    }
