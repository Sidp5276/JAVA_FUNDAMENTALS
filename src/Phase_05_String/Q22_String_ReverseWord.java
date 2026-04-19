package Phase_05_String;
import java.util.Scanner;
public class Q22_String_ReverseWord {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            String[] words = sentence.split(" ");

            StringBuilder result = new StringBuilder();
            for (String word : words) {
                StringBuilder reversedWord = new StringBuilder(word);
                result.append(reversedWord.reverse()).append(" ");
            }
            System.out.println("Reversed sentence: " + result.toString().trim());
        }
    }

