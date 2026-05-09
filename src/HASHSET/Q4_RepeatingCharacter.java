package HASHSET;
import java.util.HashSet;

public class Q4_RepeatingCharacter {
    static void main(String[] args) {
        String input = "codingpractice";
        Character result = findFirstRepeating(input);

        if (result != null) {
            System.out.println("First repeating character: '" + result + "'");
        } else {
            System.out.println("No character repeating.");
        }
    }

    public static Character findFirstRepeating(String s) {

        HashSet<Character> seen = new HashSet<>();

        for (char c : s.toCharArray()) {

            if (seen.contains(c)) {
                return c;
            }
            seen.add(c);
        }
        return null;
    }
}
