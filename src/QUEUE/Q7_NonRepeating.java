package QUEUE;
import java.util.LinkedList;
import java.util.Queue;

public class Q7_NonRepeating {
    public static void findFirstNonRepeating(String str) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            freq[ch - 'a']++;
            q.add(ch);

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.println("-1");
            } else {
                System.out.println(q.peek());
            }
        }
    }

    public static void main(String[] args) {
        String input = "aabc";
        findFirstNonRepeating(input);
    }
}
