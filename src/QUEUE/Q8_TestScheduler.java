package QUEUE;
import java.util.LinkedList;
import java .util.Queue;

public class Q8_TestScheduler {
    public static void main(String[] args) {

        Queue<String> executionQueue = new LinkedList<>();


        System.out.println("--- Scheduling Tests ---");
        executionQueue.add("Login Test");
        executionQueue.add("Payment Test");
        executionQueue.add("Logout Test");

        System.out.println("Initial Queue: " + executionQueue);
        System.out.println();


        System.out.println("--- Automation Engine Started ---");

        while (!executionQueue.isEmpty()) {

            String currentTest = executionQueue.peek();
            System.out.println("EXECUTING: " + currentTest + "...");


            try { Thread.sleep(1000); } catch (InterruptedException e) {}


            String completedTest = executionQueue.remove();
            System.out.println("COMPLETED: " + completedTest);
            System.out.println("Remaining in Queue: " + executionQueue);
            System.out.println("---------------------------------");
        }

        System.out.println("ALL TESTS EXECUTED SUCCESSFULLY.");
    }
}
