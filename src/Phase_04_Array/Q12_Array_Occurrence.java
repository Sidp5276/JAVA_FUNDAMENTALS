package Phase_04_Array;
import java.util.*;
public class Q12_Array_Occurrence {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the element to count occurrences: ");
            int x = sc.nextInt();

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == x) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println("Element " + x + " occurs " + count + " times in the array.");
            } else {
                System.out.println("Element " + x + " not found in the array.");
            }
        }
    }
