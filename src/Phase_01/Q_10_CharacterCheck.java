package Phase_01;

    import java.util.Scanner;

    public class Q_10_CharacterCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take user input
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);  // read first character of input

            // Check conditions
            if (Character.isUpperCase(ch)) {
                System.out.println("Uppercase letter");
            } else if (Character.isLowerCase(ch)) {
                System.out.println("Lowercase letter");
            } else if (Character.isDigit(ch)) {
                System.out.println("Digit");
            } else {
                System.out.println("Special character");
            }
            sc.close();
        }
    }
