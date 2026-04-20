package Phase_05_String;
import java.util.Scanner;
public class Q23_String_MiddleChar {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            int length = str.length();

            if (length % 2 == 0) {

                int mid1 = (length / 2) - 1;
                int mid2 = length / 2;
                System.out.println("Middle characters: " + str.charAt(mid1) + str.charAt(mid2));
            } else {

                int mid = length / 2;
                System.out.println("Middle character: " + str.charAt(mid));
            }
        }
    }
