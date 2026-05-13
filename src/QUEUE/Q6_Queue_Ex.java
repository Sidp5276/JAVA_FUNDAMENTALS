package QUEUE;
import java.util.*;

public class Q6_Queue_Ex {
    public static void main(String[] args) {

        Queue<String> myQueue = new LinkedList<>();


        myQueue.add("First");
        myQueue.add("Second");
        myQueue.add("Third");
        System.out.println("After add(): " + myQueue);


        String head = myQueue.peek();
        System.out.println("Peek element: " + head);
        System.out.println("After peek(): " + myQueue);


        String removed = myQueue.remove();
        System.out.println("Removed element: " + removed);
        System.out.println("After remove(): " + myQueue);
    }
}
