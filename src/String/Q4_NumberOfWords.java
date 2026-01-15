package String;
//4. Count the number of words in a sentence.
import java.util.Scanner;
public class Q4_NumberOfWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String n = sc.nextLine().trim();

        if(n.isEmpty())
        {
            System.out.println(0); return;
        }
        System.out.println(n.split("\\s+").length);
    }
}
