package OOPS.STACK;
import java.util.Stack;

public class Q7_Reverse_String {
    static void main(String[] args) {
        String input = "selenium";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed.toString());
    }
}
