package String;
//7. Count digits, alphabets, and special characters.

import java.util.Scanner;

public class Q7_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        int d=0, a=0, sp=0;
        for (char ch :s.toCharArray())
        {
            if (Character.isDigit(ch)) d++;
            else if (Character.isAlphabetic(ch)) a++;
            else sp++;
        }
        System.out.println("digit is:" + d + "\n" + "alphabet are:" + a + "\n" +"special char are:" + sp);
    }
}
