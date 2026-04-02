package Phase_04_Array;
import java.util.*;
public class Q28_Array_Rotate {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int last = arr[n - 1]; // store last element
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1]; // shift elements right
            }
            arr[0] = last;
            System.out.println("Array after rotation:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
