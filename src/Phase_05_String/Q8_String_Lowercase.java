package Phase_05_String;
import java.util.Scanner;
public class Q8_String_Lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String lower = input.toLowerCase();

        System.out.println("lowercase string: " + lower);
    }
}
