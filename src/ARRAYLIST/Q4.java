package ARRAYLIST;
import java.util.*;
// duplicate handling
public class Q4 {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5));
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer num : input) {

            if (!result.contains(num)) {
                result.add(num);
            }
        }
        System.out.println("Unique List (Maintained Order): " + result);
    }
}
