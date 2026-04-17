package Phase_05_String;
import java.util.*;
public class Q18_String_AlphabetM {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            int beforeM = 0, afterM = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (Character.isLetter(ch)) {

                    char lower = Character.toLowerCase(ch);

                    if (lower < 'm') {
                        beforeM++;
                    } else if (lower > 'm') {
                        afterM++;
                    }
            }
            System.out.println("Alphabets before 'm': " + beforeM);
            System.out.println("Alphabets after 'm': " + afterM);
        }
    }
}
