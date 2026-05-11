package OOPS.STACK;
import java.util.Stack;

public class Q9_MinStack {

        private Stack<Integer> stack;
        private Stack<Integer> minStack;

        public Q9_MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);

            // If minStack is empty, the first value is the minimum.
            // Otherwise, push the smaller of the new value and current min.
            if (minStack.isEmpty()) {
                minStack.push(val);
            } else {
                minStack.push(Math.min(val, minStack.peek()));
            }
        }

        public void pop() {
            if (!stack.isEmpty()) {
                stack.pop();
                minStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }

        public static void main(String[] args) {
            Q9_MinStack ms = new Q9_MinStack();
            ms.push(5);
            ms.push(2);
            ms.push(8);

            System.out.println("Current Min: " + ms.getMin());

            ms.pop(); // Removes 8
            ms.pop(); // Removes 2

            System.out.println("Min after pops: " + ms.getMin());
        }
    }
