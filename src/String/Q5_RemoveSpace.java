package String;
//5. Remove all spaces from a string.
import java.util.Scanner;

public class Q5_RemoveSpace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a sentence: ");
        String r = sc.nextLine();
        String noSpaces = r.replace(" ", "");

        System.out.println("Sentence without spaces: " + noSpaces);

       // System.out.println(r.replace(" ", " "));
    }
}
