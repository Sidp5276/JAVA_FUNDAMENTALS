package QUEUE;
// Hot potato Game
import java.util.LinkedList;
import java.util.Queue;

public class Q9_PotatoGame {
    public static void main(String[] args) {
        String[] people = {"A", "B", "C", "D", "E"};
        int k = 3;
        Queue<String> queue = new LinkedList<>();
        for (String person : people) {
            queue.add(person);
        }

        System.out.println("Initial Queue: " + queue);

        while (queue.size() > 1) {

            for (int i = 1; i < k; i++) {
                String potatoHolder = queue.remove();
                queue.add(potatoHolder); // Move to back
            }

            String eliminated = queue.remove();
            System.out.println("Eliminated: " + eliminated + " | Remaining: " + queue);
        }

        System.out.println("WINNER: " + queue.peek());
    }
}
