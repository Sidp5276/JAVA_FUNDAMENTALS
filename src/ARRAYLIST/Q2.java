package ARRAYLIST;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>(List.of(5, 8, 9, 4, 6, 12, 85, 97, 258, 396));

                System.out.println("Original List: " + num);

                Iterator<Integer> it = num.iterator();

                while (it.hasNext()) {
                    Integer n = it.next();

                    if (n % 2 == 0) {
                        it.remove();
                    }
                }

                System.out.println("Only Odd Numbers: " + num);
            }
        }

