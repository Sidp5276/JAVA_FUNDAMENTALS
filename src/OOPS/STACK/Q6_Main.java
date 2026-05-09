package OOPS.STACK;
import java.util.Stack;

public class Q6_Main {
    static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        System.out.println("Stack after pushing 5 elements: " + myStack);

        myStack.pop();
        myStack.pop();
        System.out.println("Stack after popping 2 elements: " + myStack);

        int topElement = myStack.peek();
        System.out.println("Top element (Peek): " + topElement);

        System.out.println("Final Stack: " + myStack);
    }
}
