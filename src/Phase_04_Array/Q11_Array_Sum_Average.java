package Phase_04_Array;
import java.util.*;
public class Q11_Array_Sum_Average {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }

            double average = (double) sum / n;

            // Step 5: Print results
            System.out.println("Sum of all elements = " + sum);
            System.out.println("Average of all elements = " + average);
        }
    }

