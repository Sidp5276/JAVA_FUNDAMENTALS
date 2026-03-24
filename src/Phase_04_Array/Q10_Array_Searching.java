package Phase_04_Array;
import java.util.*;
public class Q10_Array_Searching {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the value of k: ");
            int k = sc.nextInt();

            System.out.println("Elements greater than " + k + " are:");
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] > k) {
                    System.out.print(arr[i] + " ");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No elements greater than " + k);
            }
        }
    }
