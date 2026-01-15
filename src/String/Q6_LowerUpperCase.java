package String;
//6. Convert lowercase to uppercase and vice versa.
import java.util.Scanner;

public class Q6_LowerUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String l = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (char ch :l.toCharArray()) {
            if (Character.isLowerCase(ch)) sb.append(Character.toUpperCase(ch));
            else if (Character.isUpperCase(ch)) sb.append(Character.toLowerCase(ch));
            else sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
