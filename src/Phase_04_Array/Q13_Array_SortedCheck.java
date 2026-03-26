package Phase_04_Array;
import java.util.*;
public class Q13_Array_SortedCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                System.out.println("The array is sorted in ascending order.");
            } else {
                System.out.println("The array is NOT sorted.");
            }
        }
    }

