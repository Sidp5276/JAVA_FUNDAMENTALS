package Phase_04_Array;
import java.util.*;
public class Q24_Array_ReverseLeft {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int first = arr[0];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[n - 1] = first;

            System.out.print("Rotated Array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

