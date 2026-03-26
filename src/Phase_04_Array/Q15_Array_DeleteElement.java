package Phase_04_Array;
import java.util.*;
public class Q15_Array_DeleteElement {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the element to delete: ");
            int x = sc.nextInt();

            // Step 4: Count occurrences of x
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == x) {
                    count++;
                }
            }

            int[] newArr = new int[n - count];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != x) {
                    newArr[j] = arr[i];
                    j++;
                }
            }

            if (count > 0) {
                System.out.println("New array after deleting " + x + ":");
                for (int i = 0; i < newArr.length; i++) {
                    System.out.print(newArr[i] + " ");
                }
            } else {
                System.out.println("Element " + x + " not found in the array.");
            }
    }
}
