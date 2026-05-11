package OOPS.STACK;
import java.util.Stack;

public class Q8_Bracket_Checker {

        public static String isBalanced(String input) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                char current = input.charAt(i);

                // If it's an opening bracket, push to stack
                if (current == '{' || current == '[' || current == '(') {
                    stack.push(current);
                }
                // If it's a closing bracket
                else if (current == '}' || current == ']' || current == ')') {

                    // If stack is empty, there's no matching opening bracket
                    if (stack.isEmpty()) {
                        return "Invalid";
                    }

                    char lastOpened = stack.pop();

                    // Check for mismatches
                    if (current == '}' && lastOpened != '{') return "Invalid";
                    if (current == ']' && lastOpened != '[') return "Invalid";
                    if (current == ')' && lastOpened != '(') return "Invalid";
                }
            }

            // If stack is empty, all brackets were matched correctly
            return stack.isEmpty() ? "Valid" : "Invalid";
        }

        public static void main(String[] args) {
            // Test Cases
            String input1 = "{[()]}";
            String input2 = "{[(])}";

            System.out.println("Input: " + input1 + " -> Output: " + isBalanced(input1));
            System.out.println("Input: " + input2 + " -> Output: " + isBalanced(input2));
        }
    }
