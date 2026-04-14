package Phase_05_String;
import java.util.*;
public class Q12_String_ASCII {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            System.out.println("Character : ASCII Value");
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                int ascii = (int) ch;
                System.out.println(ch + " : " + ascii);
            }
        }
}
