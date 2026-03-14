package Apna_College;
import java.util.*;
public class Q7_Odd_Sum {
    public static void odd(int n) {
       int sum = 0;
       for(int i =1; i<=n; i++) {
           if(i % 2 != 0) {
               sum +=i;
               System.out.print(i);
               if (i + 2 <= n){
                   System.out.print("+");
               }
           }
       }
        System.out.println(" = " + sum);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        odd(n);
    }
}
