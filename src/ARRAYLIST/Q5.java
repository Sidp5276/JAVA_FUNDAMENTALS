package ARRAYLIST;
import java.util.*;

// sort by length

public class Q5 {
        public static void main(String[] args) {

            List<String> fruits = new ArrayList<>(Arrays.asList("banana", "apple", "kiwi", "grapes"));

            fruits.sort(Comparator.comparingInt(String::length));

            System.out.println(fruits);
        }
    }
