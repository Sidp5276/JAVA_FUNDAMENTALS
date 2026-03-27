package Phase_04_Array;
import java.util.*;
public class Q16_Array_Unique {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            HashSet<Integer> set = new HashSet<>();
            boolean unique = true;

            for (int num : arr) {
                if (!set.add(num)) { // if add returns false, duplicate found
                    unique = false;
                    break;
                }
            }

            if (unique) {
                System.out.println("All elements are unique.");
            } else {
                System.out.println("Array contains duplicate elements.");
            }
        }
    }

