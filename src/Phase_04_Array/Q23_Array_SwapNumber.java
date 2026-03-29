package Phase_04_Array;
import java.util.*;
public class Q23_Array_SwapNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (n > 1) {  // swap only if array has more than 1 element
                int temp = arr[0];
                arr[0] = arr[n - 1];
                arr[n - 1] = temp;
            }

            System.out.println("Array after swapping first and last elements:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}
