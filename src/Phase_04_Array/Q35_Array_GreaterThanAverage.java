package Phase_04_Array;
import java.util.*;
public class Q35_Array_GreaterThanAverage {
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

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > average) {
                    count++;
                }
            }

            System.out.println("Average of array = " + average);
            System.out.println("Number of elements greater than average = " + count);
        }
    }
