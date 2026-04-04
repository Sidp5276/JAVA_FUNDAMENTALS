package Phase_04_Array;
import java.util.*;

public class Q31_Array_DuplicateElement {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int num : arr) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            System.out.println("Duplicate elements are:");
            boolean found = false;
            for (int key : freq.keySet()) {
                if (freq.get(key) > 1) {
                    System.out.println(key);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No duplicates found.");
            }
        }
    }
