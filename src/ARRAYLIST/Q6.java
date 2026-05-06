package ARRAYLIST;
import java.util.*;
// table validation

public class Q6 {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("John", "Alice", "Bob", "John", "Eve");

            Set<String> uniqueSet = new HashSet<>();
            Set<String> duplicates = new HashSet<>();

            for (String name : names) {

                if (!uniqueSet.add(name)) {
                    duplicates.add(name);
                }
            }

            System.out.println("Duplicates found: " + duplicates);
            System.out.println("Unique values: " + uniqueSet);
        }
    }