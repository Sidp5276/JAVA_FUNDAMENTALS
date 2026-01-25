package Phase_01;
import java.util.Scanner;

public class Q_16_AlphaChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if(ch >='a' && ch<='m'){
            System.out.println("CHAR is between a & m");
        }
        else if (ch >= 'n' && ch <= 'z'){
            System.out.println("CHAR is between n & z");
        }
        else {
            System.out.println("Enter a valid char");
        }
    }
}
