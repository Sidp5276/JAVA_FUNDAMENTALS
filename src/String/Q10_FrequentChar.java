package String;
//10. Find the most frequent character.

import java.util.Scanner;
import java.util.HashMap;

public class Q10_FrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch: s.toCharArray())
            map.put(ch, map.getOrDefault(ch,0)+1);
        int mx = 0;
        for (char k : map.keySet()) {
            mx = Math.max(mx, map.get(k));
        }

        System.out.print("Most frequent character(s): ");
        for (char k : map.keySet()) {
            if (map.get(k) == mx) {
                System.out.print(k + " ");
            }
        }
        System.out.println("\nFrequency: " + mx);
}
}
