package Phase_05_String;
import java.util.Scanner;
public class Q21_String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        for(int i = 0; i<= str.length()/2; i++){
            char start = str.charAt(i);
            char end  = str.charAt(str.length()-i-1);
            if (start != end){
                return false;
            }
        }
        return true;
    }
}
