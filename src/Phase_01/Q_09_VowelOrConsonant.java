package Phase_01;

    import java.util.Scanner;

    public class Q_09_VowelOrConsonant {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take user input
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);  // read first character of input

            // Convert to lowercase for easier comparison
            ch = Character.toLowerCase(ch);

            // Check if it's a letter
            if (Character.isLetter(ch)) {
                // Check vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("Not an alphabet character!");
            }
            sc.close();
        }
    }
