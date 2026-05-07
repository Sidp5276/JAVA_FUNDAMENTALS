package LinkedList;
import java.util.*;

public class Q4_Filter_LL {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LinkedList<Integer> list = new LinkedList<>();

            System.out.println("Enter numbers between 1-50 (Enter a non-number or out-of-range to stop):");

            while (sc.hasNextInt()) {
                int val = sc.nextInt();
                if (val < 1 || val > 50) break; // Stop if outside 1-50
                list.add(val);
            }

            System.out.println("Original List: " + list);

            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() > 25) {
                    it.remove();
                }
            }

            System.out.println("Filtered List (Values <= 25): " + list);
        }
    }
