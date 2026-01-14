package String;
//3. Count vowels and consonants in a string.
 import java.util.Scanner;

public class Q3_Count_VowelConsonant {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String let = sc.next();
        int v=0,c=0;
        for(char ch: let.toCharArray()){
            char d=Character.toLowerCase(ch);
            if(Character.isLetter(d)){
                if("aeiou".indexOf(d)>=0) v++;
                else c++;
            }
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }
}
