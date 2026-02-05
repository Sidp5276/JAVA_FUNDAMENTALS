package Phase_01;
// Take a character and check if it is a letter, a digit, or neither.
//import java.sql.SQLOutput;
import java.util.Scanner;
public class Q_29_CharCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charcter: ");
        char n = sc.next().charAt(0);
        if (Character.isLetter(n)) {
            System.out.println("is a Letter");
        } else if (Character.isDigit(n)) {
            System.out.println("is a Digit");
        } else {
            System.out.println("is Neither Letter or Digit ");
        }
    }
}